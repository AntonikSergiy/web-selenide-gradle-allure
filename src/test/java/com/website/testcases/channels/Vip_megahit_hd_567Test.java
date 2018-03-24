package com.website.testcases.channels;

import com.codeborne.selenide.ElementsCollection;
import com.website.base.TestBase;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Vip_megahit_hd_567Test extends TestBase {

    @Features("Channels")
    @Stories("VIP Megahit HD")
    @Title("EPG channels")
    @Description("Test channels")
    @Severity(SeverityLevel.BLOCKER)
    @Issue("FB-1907")
    @TestCaseId("TMS-123")
    @Test(groups = "fast")
    public void visibleEPGChannels() {
        open("/tv/vip-megahit-hd-567");
        ElementsCollection epgIkonList = $("ul.epg-item-placeholder").findAll("i");
        epgIkonList.shouldHave(sizeGreaterThanOrEqual(5));
    }

}
