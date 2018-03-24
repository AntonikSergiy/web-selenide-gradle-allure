package com.website.pages;

import com.codeborne.selenide.SelenideElement;
import com.website.base.PageBase;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.website.utils.Locators.get;



public class MainPage extends PageBase {


    private static final By
            HEADER_PROFILE_ICON = get("header.profile-icon");
    private static final String

            TITLE = "Divan TV — онлайн ТВ и фильмы на телевизоре, планшете, смартфоне и компьютере";


    //Method for get Element --------------------------
    private SelenideElement logoProfile;

    public MainPage() {
        this.logoProfile = $("#jv__navbar-profile-link").$(".material-icons");
    }

    public SelenideElement getLogoProfile() {
        return logoProfile;
    }

    @Step("Should appear Main page")
    public static void shouldAppear() {
        shouldAppear(TITLE);

    }

    @Step("Assert profile User visible")
    public MainPage assertLoginUser() {
        $(HEADER_PROFILE_ICON).shouldBe(visible);
        return new MainPage();
    }



}

