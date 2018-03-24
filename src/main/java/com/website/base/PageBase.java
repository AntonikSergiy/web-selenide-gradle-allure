package com.website.base;

import com.website.utils.Waiter;

import static com.codeborne.selenide.Selenide.title;

public class PageBase {

    protected static void shouldAppear(String title) {
        try {
            Waiter.waitForPageTitle(title);
        } catch (Exception e) {
            throw new AssertionError(String.format("Incorrect page title! Expected: '%s', Actual: '%s'", title, title()));
        }
    }
}
