package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    // It's a post condition. This closes all the windows in the browser
    @AfterClass
    public void takeDown() {
        // driver.quit();
        // driver.close(); closes the current window
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(2000);
        // Find an element
        WebElement username = driver.findElement(By.name("username"));
        // Do an action. Type in the username "Admin"
        username.sendKeys("Admin");

        // Same for password. Find the element
        var password = driver.findElement(By.name("password"));
        // Type in the password "admin123"
        password.sendKeys("admin123");

        // Find the login button and click
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";

        // Assertion that the test passed
        Assert.assertEquals(actualResult, expectedResult);

    }


}
