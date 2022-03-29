package tests.com.github;

import com.codeborne.selenide.Condition;
import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ZorinGithubTest {

    @Test
    @AllureId("8024")
    @DisplayName("Check Security section in Product tab")
    @Owner("allure8")
    void zorinTest() {
        step("Open github page");
        open("https://www.github.com");

        step("Hover on the Product tab");
        $(byText("Product")).hover();

        step("Check Security section is visible");
        $(byText("Security")).shouldBe(Condition.visible);


    }
}
