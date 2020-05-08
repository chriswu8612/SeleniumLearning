package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
    public static void main(String[] args) {
        System.out.println("Running CreateAccount");
        System.setProperty("webdriver.chome.driver", "C:\\Apps\\Cloud\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("http://www.aa.com");
        //driver.findElement(By.linkText("Contact American")).click();

        driver.get("https://www.google.com");

        //driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("saucelab selenium example");
        driver.findElement(By.className("gLFyf")).sendKeys("saucelab selenium example");
        driver.findElement(By.name("btnK")).click();
        driver.close();
    }
}
