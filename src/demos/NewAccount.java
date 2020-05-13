package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class NewAccount {
    public static void main(String[] args) {
        String name = "Mary Smith";
        String email = "ms@testemail.com";
        String password = "mspass";
        String phoneNumber = "1231231234";
        String country = "Germany";
        String browserType = "firefox";

        String gender;
        String weeklyEmail;
        String monthlyEmail;
        String occasionalEmail;

        // 1. Open Browser to Account Management Page >> Click on Create Account
        WebDriver driver = DriverFactory.open(browserType);
        driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
        driver.findElement(By.linkText("Create Account")).click();

        // 3. Fill out the form
        driver.findElement(By.name("ct100$MainContent$txstFirstName")).sendKeys(name);
        driver.findElement(By.id("mainContent_txtEmail")).sendKeys(email);

        driver.findElement(By.xpath("//*[@id='MainContent_txtHomePhone']")).sendKeys(phoneNumber);
        driver.findElement(By.cssSelector("input[type='password'][id='MainContent_txtPassword']")).sendKeys(password);
        driver.findElement(By.name("ct100$MainContent$txtVerifyPassword")).sendKeys(password);


    }
}
