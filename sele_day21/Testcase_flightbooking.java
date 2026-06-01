package sele_day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testcase_flightbooking  {

    public static void main(String[] args) throws InterruptedException {

        

        WebDriver driver = new ChromeDriver();
        

        driver.get("https://blazedemo.com");
        driver.manage().window().maximize();
        
        WebElement source =driver.findElement(By.name("fromPort"));
        source.sendKeys("Boston");

     
        WebElement destination =
                driver.findElement(By.name("toPort"));
        destination.sendKeys("London");

        
        driver.findElement(
                By.cssSelector("input[type='submit']"))
                .click();

        
        driver.findElement(
                By.xpath("(//input[@value='Choose This Flight'])[1]"))
                .click();

        
        driver.findElement(By.id("inputName"))
                .sendKeys("Devrath");

        driver.findElement(By.id("address"))
                .sendKeys("Kolkata");

        driver.findElement(By.id("city"))
                .sendKeys("Kolkata");

        driver.findElement(By.id("state"))
                .sendKeys("West Bengal");

        driver.findElement(By.id("zipCode"))
                .sendKeys("700001");

        driver.findElement(By.id("creditCardNumber"))
                .sendKeys("123456789123");

        driver.findElement(By.id("nameOnCard"))
                .sendKeys("Devrath Singh");

        
        driver.findElement(
                By.cssSelector("input[type='submit']"))
                .click();

        
        String bookingMsg =
                driver.findElement(By.tagName("h1")).getText();

        if (bookingMsg.contains("Thank you")) {
            System.out.println("Booking Successful");
        } else {
            System.out.println("Booking Failed");
        }

        Thread.sleep(3000);

        driver.quit();
    }
}
