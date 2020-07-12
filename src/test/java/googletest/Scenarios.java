package googletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenarios {
    @Test
    public void test(){

        System.setProperty("webdriver.chrome.driver",System.getProperty("chromeDriver"));
        //WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        driver.quit();
    }
}
