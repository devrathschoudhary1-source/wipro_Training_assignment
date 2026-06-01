
	package Class_assi_Day22;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Amz_Login {

	    public static void main(String[] args) throws InterruptedException {

	    
	        WebDriver driver = new ChromeDriver();

	        
	        driver.get("https://www.amazon.in");

	       
	        driver.manage().window().maximize();
	        Thread.sleep(2000);

	        
	        driver.findElement(By.id("nav-link-accountList"))
	              .click();
	        Thread.sleep(2000);

	        
	        driver.findElement(By.id("ap_email_login"))
	              .sendKeys("devrathsinghchoudhary@gmail.com");
	        Thread.sleep(1000);

	        driver.findElement(By.id("continue"))
	              .click();
	        Thread.sleep(2000);

	        
	        driver.findElement(By.id("ap_password"))
	              .sendKeys("Dev@1234");
	        Thread.sleep(1000);

	        
	        driver.findElement(By.id("signInSubmit"))
	              .click();

	        Thread.sleep(5000);

	        
	        System.out.println(driver.getTitle());

	        
	        driver.quit();
	    }
	}


