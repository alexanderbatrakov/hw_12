package tests;

import org.junit.jupiter.api.Test;

public class GitHubTests extends TestBase {
    @Test
    void gitHubTest() {
        supportClass.openLink()
                .clickOnWikiButton()
                .searchSoftAssertionPage()
                .clickOnSoftAssertionLink()
                .checkJunit5Example();
    }
}
