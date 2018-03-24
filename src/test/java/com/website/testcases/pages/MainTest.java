package com.website.testcases.pages;

import com.website.base.TestBase;
import com.website.domain.TestData;
import com.website.domain.User;
import com.website.pages.LoginPopUP;
import com.website.pages.MainPage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

public class MainTest extends TestBase {


    @Features("Page")
    @Stories("Main page")
    @Title("Check element page")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Description MainPage: User visible profile Icon")
    @TestCaseId("A")
    @Issue("22")
    @Test(priority = 0, description = "User Authorization")
    public void testLoginAsValidUser() {
        User user = TestData.getUser();
        new LoginPopUP()
                .open()
                .loginAs(user);
        new MainPage().assertLoginUser();
    }
}
