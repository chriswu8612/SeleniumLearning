package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
    // This method returns a WebDriver object
    public static WebDriver open(String browserType) {
        if (browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chome.driver", "C:\\Apps\\webdrivers\\chromedriver.exe");
            return new FirefoxDriver();


        } else if (browserType.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "C:\\Apps\\webdrivers\\chromedriver.exe");
            return new InternetExplorerDriver();
        } else {
            System.setProperty("webdriver.chome.driver", "C:\\Apps\\webdrivers\\IEDriverServer.exe");
            return new ChromeDriver();
        }
    }
}
