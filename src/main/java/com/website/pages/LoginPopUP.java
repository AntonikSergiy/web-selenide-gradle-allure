package com.website.pages;

import com.website.base.PageBase;
import com.website.domain.User;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.website.utils.Locators.get;

public class LoginPopUP extends PageBase{

    private static final By
        LOGIN_MENU = get("login.menu-btn"),
        LOGIN_LABEL_EMAIL_LOGIN = get("login.email-login"),
        LOGIN_POLE_PSW = get("login.pole-psw"),
        LOGIN_ENTER_BTN = get("login.enter-btn"),
        ERROR_PASSWORD_MESSAGE = get("loginPopup.error-password-Message");

    @Step("Open web site.")
    public LoginPopUP open() {
        $(LOGIN_MENU)
                .waitUntil(visible,20000)
                .click();
        return this;
    }

    @Step("Log into web site as user:{0}.")
    public LoginPopUP loginAs(User user) {
        $(LOGIN_LABEL_EMAIL_LOGIN)
                .waitUntil(visible,20000)
                .click();
        $(LOGIN_LABEL_EMAIL_LOGIN).val(user.getName());
        $(LOGIN_POLE_PSW).val(user.getPassword());
        $(LOGIN_ENTER_BTN).click();
        return new LoginPopUP();
    }

    @Step("Error Massage")
    public void assertErrorMessage(String text) {
        $(ERROR_PASSWORD_MESSAGE)
                .waitUntil(visible,30000)
                .shouldHave(text(text));
    }
}
