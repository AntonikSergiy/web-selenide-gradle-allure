package com.website.utils;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Waiter {

    private static final int DEFAULT_TIME_OUT = 10;

    public static void waitForPageTitle(String title) {
        getWaiter().until(ExpectedConditions.titleIs(title));
    }

    private static WebDriverWait getWaiter() {
        return new WebDriverWait(getWebDriver(), DEFAULT_TIME_OUT);
    }
}


