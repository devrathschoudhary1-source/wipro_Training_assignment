package Class_assi_day25;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class Flight_WaitforSearch {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://blazedemo.com");



        driver.findElement(By.name("fromPort")).click();



        driver.findElement(By.name("toPort")).click();



        driver.findElement(
                By.xpath("//input[@value='Find Flights']"))
                .click();



        FluentWait<WebDriver> wait =
                new FluentWait<WebDriver>(driver)

                .withTimeout(Duration.ofSeconds(30))

                .pollingEvery(Duration.ofSeconds(2))

                .ignoring(Exception.class);



        wait.until(

                new Function<WebDriver, Boolean>() {

                    public Boolean apply(WebDriver driver) {

                        return driver.findElement(
                                By.xpath("//table"))
                                .isDisplayed();
                    }
                }

        );



        System.out.println(
                "Flight Results Displayed Successfully");



        driver.quit();

    }
}