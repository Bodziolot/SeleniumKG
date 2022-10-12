import org.example.base.SeleniumTestBase;
import org.example.pageobjects.AspAccount;
import org.example.pageobjects.FaqPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebsiteTest extends SeleniumTestBase {

    @Test
    public void TestCase1() {
        FaqPage faqPage = new FaqPage(driver);
        faqPage.getAcceptSelectedCookiesButton().click();

        // Print out header of the card
        System.out.println(faqPage.getLatestNewsHeader().getText());

        // Print out count of card links
        System.out.println(faqPage.getCardLinks().size());

        // Print out link nr 2 href
        System.out.println(faqPage.getCardLinks().get(1).getText());

        // Come up with 2 assertions for elements in the card
        assertEquals("false", faqPage.getFaqQuestion().getAttribute("aria-expanded"), "An answer should not be displayed");
        faqPage.getFaqQuestion().click();
        assertEquals("true", faqPage.getFaqQuestion().getAttribute("aria-expanded"), "An answer should be displayed");

        // Click on link nr 2
        faqPage.getCardLinks().get(1).click();

        // Add assertion that you were redirected correctly
        AspAccount aspAccount = new AspAccount(driver);
        assertEquals("ASP account", aspAccount.getAspHeaderBy().getText());
    }
}
