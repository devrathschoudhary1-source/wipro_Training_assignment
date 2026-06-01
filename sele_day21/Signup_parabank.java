package sele_day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup_parabank {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

       
        driver.manage().window().maximize();

        Thread.sleep(2000);

        
        driver.findElement(By.linkText("Register")).click();

        Thread.sleep(2000);

        
        driver.findElement(By.id("customer.firstName")).sendKeys("Devrath");

        driver.findElement(By.id("customer.lastName")).sendKeys("Singh");

        driver.findElement(By.id("customer.address.street")).sendKeys("Kolkata");

        driver.findElement(By.id("customer.address.city")).sendKeys("Kolkata");

        driver.findElement(By.id("customer.address.state")).sendKeys("West Bengal");

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("700001");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");

        driver.findElement(By.id("customer.ssn")).sendKeys("123456");

        driver.findElement(By.id("customer.username")).sendKeys("dev12345");

        driver.findElement(By.id("customer.password")).sendKeys("Pass123");

        driver.findElement(By.id("repeatedPassword")).sendKeys("Pass123");

        Thread.sleep(2000);

        
        driver.findElement(By.xpath("//input[@value='Register']")).click();

        Thread.sleep(5000);

       
        driver.quit();
    }
}
