package org.example.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AspAccountPage {
    private final By aspHeaderBy = By.xpath("//h1[contains(.,'ASP account')]");
    protected WebDriver driver;

    public AspAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAspHeaderBy() {
        return driver.findElement(aspHeaderBy);
    }
}
