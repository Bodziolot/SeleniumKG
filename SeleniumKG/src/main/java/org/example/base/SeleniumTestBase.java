package org.example.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SeleniumTestBase {
    public static WebDriver driver = null;

    public SeleniumTestBase() {
        prepareWebDriver();
    }

    private static void prepareWebDriver() {
        String osName = System.getProperty("os.name").toLowerCase();
        String chromeDriverPath = "src/main/resources/drivers/";

        if (osName.startsWith("mac")) {
            chromeDriverPath += "chromedriverMacOS";
        } else {
            chromeDriverPath += "chromedriverWindows.exe";
        }

        if (!System.getProperty("pathToChromedriver").equals("")) {
            chromeDriverPath = System.getProperty("pathToChromedriver");
        }

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        ChromeOptions chromeOptions = new ChromeOptions();
        if (System.getProperty("headless").equals("true")) {
            chromeOptions.setHeadless(true);
        }
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeEach
    public void before() {
        driver.navigate().to("https://www.nordea.fi/en/personal/get-help/");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}


