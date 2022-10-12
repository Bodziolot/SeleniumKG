package org.example.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FaqPage {
    private final By acceptSelectedCookiesButtonBy = By.xpath("//a[contains(.,'Accept selected')]");
    private final By latestNewsHeaderBy = By.xpath("//h2[contains(.,'Latest news')]");
    private final By cardLinksBy = By.cssSelector(".fakeArticle li a");
    private final By faqQuestionBy = By.xpath("//a[contains(.,'How do I close my Disposal account?')]");
    protected WebDriver driver;

    public FaqPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAcceptSelectedCookiesButton() {
        return driver.findElement(acceptSelectedCookiesButtonBy);
    }

    public WebElement getLatestNewsHeader() {
        return driver.findElement(latestNewsHeaderBy);
    }

    public List<WebElement> getCardLinks() {
        return driver.findElements(cardLinksBy);
    }

    public WebElement getFaqQuestion() {
        return driver.findElement(faqQuestionBy);
    }
}
