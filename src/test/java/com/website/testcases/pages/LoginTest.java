package com.website.testcases.pages;

import com.website.base.TestBase;
import com.website.domain.TestData;
import com.website.domain.User;
import com.website.pages.LoginPopUP;
import com.website.pages.MainPage;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

public class LoginTest extends TestBase {


    @Features("Registration and Authorization")
    @Stories("Authorization")
    @Title("User authorization by login")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Description LoginTest: User con login to Main page")
    @Test(priority = 1, description = "Valid Login and password")
    public void invalidLoginTest_InvalidPassword() {
        User user = TestData.getUserFailPass();
        new LoginPopUP()
                .open()
                .loginAs(user)
                .assertErrorMessage("Неверный логин или пароль");
    }

}
