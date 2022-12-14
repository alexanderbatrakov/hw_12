package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {
    SupportClass supportClass = new SupportClass();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
}
