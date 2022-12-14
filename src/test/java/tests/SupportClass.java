package tests;

import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SupportClass {
    public SupportClass openLink() {
        open("https://github.com/selenide/selenide");
        return this;
    }

    public SupportClass clickOnWikiButton() {
        $("#wiki-tab").click();
        return this;
    }

    public SupportClass searchSoftAssertionPage() {
        $(".markdown-body").$(new ByText("Soft assertions")).should(exist);
        return this;
    }

    public SupportClass clickOnSoftAssertionLink() {
        $(".markdown-body").$(new ByText("Soft assertions")).click();
        return this;
    }

    public SupportClass checkJunit5Example() {
        $$(".markdown-body h4").get(2).shouldHave(text("3. Using JUnit5 extend test class:"));
        return this;
    }
}

