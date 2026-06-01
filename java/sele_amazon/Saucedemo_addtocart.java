package sele_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo_addtocart {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.saucedemo.com/");

     
        driver.manage().window().maximize();

        
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

    
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

    
        driver.findElement(By.id("login-button"))
              .click();

        
        Thread.sleep(2000);

 
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
              .click();

        
        Thread.sleep(2000);

  
        driver.findElement(By.className("shopping_cart_link"))
              .click();

       
        Thread.sleep(2000);

   
        System.out.println("Product added to cart successfully!");

        
        driver.quit();
    }
}