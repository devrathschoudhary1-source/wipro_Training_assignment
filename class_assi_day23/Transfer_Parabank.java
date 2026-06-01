package class_assi_day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Transfer_Parabank {

    WebDriver driver;

    String username = "devrath987";
    String password = "dev@123";

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test(priority = 1)
    public void loginTest() {

        // Login

        driver.findElement(By.name("username"))
                .sendKeys(username);

        driver.findElement(By.name("password"))
                .sendKeys(password);
        

        driver.findElement(By.xpath("//input[@value='Log In']"))
                .click();

        String accountText = driver.findElement(By.className("title")).getText();

        Assert.assertEquals(accountText, "Accounts Overview");

        System.out.println("Login Successful");
    }

    @Test(priority = 2)
    public void transferMoneyTest()  throws InterruptedException {

        driver.findElement(By.name("username"))
                .sendKeys(username);

        driver.findElement(By.name("password"))
                .sendKeys(password);

        driver.findElement(By.xpath("//input[@value='Log In']"))
                .click();

        driver.findElement(By.linkText("Transfer Funds"))
                .click();
        Thread.sleep(2000);

        driver.findElement(By.id("amount"))
                .sendKeys("500");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Transfer']"))
                .click();
        Thread.sleep(2000);

        String successMessage = driver.findElement(
                By.xpath("//h1[contains(text(),'Transfer Complete!')]"))
                .getText();

        Assert.assertTrue(successMessage.contains("Transfer Complete!"));

        System.out.println("Money Transfer Successful");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);

        driver.quit();
    }
}