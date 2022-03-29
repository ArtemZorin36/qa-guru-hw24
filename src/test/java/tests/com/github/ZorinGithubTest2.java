package tests.com.github;

import com.codeborne.selenide.Condition;
import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ZorinGithubTest2 {

    @Test
    @AllureId("8025")
    @DisplayName("Check 'Start a free trial' button")
    @Owner("allure8")
    void zorinTest2() {
        step("Open github page");
        open("https://www.github.com");

        step("Click Enterprise tab");
        $("a[data-analytics-event='{\"category\":\"Header menu top item (logged out)\",\"action\":" +
                "\"click to go to Enterprise\",\"label\":\"ref_page:/;ref_cta:Enterprise;\"}']").click();

        step("Check Start a free trial button is visible");
        $("a[data-analytics-event='{\"category\":\"Organization creation\",\"action\":" +
                "\"click to set up organization\",\"label\":" +
                "\"ref_page:/enterprise;ref_cta:Start a free trial;ref_loc:hero\"}']").shouldBe(Condition.visible);


    }
}
