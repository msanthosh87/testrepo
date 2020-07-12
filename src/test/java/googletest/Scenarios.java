package googletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenarios {
    @Test
    public void test(){

        System.setProperty("webdriver.chrome.driver",System.getProperty("chromeDriver"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        driver.quit();
    }
}
