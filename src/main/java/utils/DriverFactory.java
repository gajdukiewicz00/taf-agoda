package utils;

import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", Config.getDriverPath());
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                default:
                    System.setProperty("webdriver.chrome.driver", Config.getDriverPath());
                    driver = new ChromeDriver();
                    break;
            }
        }
        return driver;
    }


    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
