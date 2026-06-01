package class_assi_day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParaBank_Testng {

    WebDriver driver;

    String username = "devrath987";
    String password = "dev@123";

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }

    @Test(priority = 1)
    public void verifyRegisterPageTitle() {

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,
                "ParaBank | Register for Free Online Account Access");

        System.out.println("Register Page Title Validation Passed");
    }

    @Test(priority = 2)
    public void signupAndLoginTest() {

        

        driver.findElement(By.id("customer.firstName"))
                .sendKeys("Devrath");

        driver.findElement(By.id("customer.lastName"))
                .sendKeys("Singh");

        driver.findElement(By.id("customer.address.street"))
                .sendKeys("Kolkata");

        driver.findElement(By.id("customer.address.city"))
                .sendKeys("Kolkata");

        driver.findElement(By.id("customer.address.state"))
                .sendKeys("West Bengal");

        driver.findElement(By.id("customer.address.zipCode"))
                .sendKeys("700001");

        driver.findElement(By.id("customer.phoneNumber"))
                .sendKeys("9876543210");

        driver.findElement(By.id("customer.ssn"))
                .sendKeys("123456");

        driver.findElement(By.id("customer.username"))
                .sendKeys(username);

        driver.findElement(By.id("customer.password"))
                .sendKeys(password);

        driver.findElement(By.id("repeatedPassword"))
                .sendKeys(password);

        driver.findElement(By.xpath("//input[@value='Register']"))
                .click();

        String successMessage = driver.findElement(
                By.xpath("//p[contains(text(),'Your account was created successfully')]"))
                .getText();

        Assert.assertTrue(successMessage.contains("Your account was created successfully"));

        System.out.println("Signup Successful");

       

        driver.findElement(By.linkText("Log Out")).click();

        

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

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);

        driver.quit();
    }
}