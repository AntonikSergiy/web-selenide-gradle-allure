package com.website.base;

import com.codeborne.selenide.Configuration;
import com.website.utils.Highlighter;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.addListener;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;


public class TestBase {

    private static final String BASE_URL = "https://divan.tv/";

    public static final Logger LOGGER = Logger.getLogger(TestBase.class.getName());
    private static final String BROWSER = "chrome";
    private static final int TIMEOUT = 5000;

    @BeforeClass
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = System.getProperty("browser", BROWSER);
        Configuration.baseUrl = System.getProperty("baseUrl", BASE_URL);
        Configuration.startMaximized = false;
        Configuration.browserSize = "1024x1000";
        Configuration.holdBrowserOpen = false;
//        Configuration.timeout = TIMEOUT;
        addListener(new Highlighter());


        LOGGER.setLevel(Level.CONFIG);
        open(BASE_URL);
    }

    @BeforeMethod
    public void clearCache() {
        clearBrowserCache();
    }


}