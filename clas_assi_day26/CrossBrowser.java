package clas_assi_day26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

    WebDriver driver;

    @Parameters("browser")

    @Test
    public void launchBrowser(String browser)
    {

        // Chrome Browser
        if(browser.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();

            System.out.println("Chrome Browser Launched");
        }

        // Edge Browser
        else if(browser.equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();

            System.out.println("Edge Browser Launched");
        }

        // Firefox Browser
        else if(browser.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();

            System.out.println("Firefox Browser Launched");
        }

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        System.out.println("Website Opened Successfully");
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.quit();

        System.out.println("Browser Closed");
    }
}
