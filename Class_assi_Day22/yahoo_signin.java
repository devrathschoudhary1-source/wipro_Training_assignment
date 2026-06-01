
	package Class_assi_Day22;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class  yahoo_signin {

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();

	        
	        driver.get("https://login.yahoo.com/account/create");

	        driver.manage().window().maximize();
	        Thread.sleep(3000);

	       

	        driver.findElement(By.id("reg-firstName"))
	                .sendKeys("Devrath");
	        Thread.sleep(500);

	        driver.findElement(By.id("reg-lastName"))
	                .sendKeys("Singh");
	        Thread.sleep(500);

	        driver.findElement(By.id("reg-userId"))
	                .sendKeys("devrathsinghchoudhary");
	        Thread.sleep(500);

	        driver.findElement(By.id("reg-password"))
	                .sendKeys("Dev@1234");
	        Thread.sleep(500);

	        

	        
	        driver.findElement(By.id("undefined-mm"))
	                .sendKeys("11");
	        Thread.sleep(500);

	        driver.findElement(By.id("undefined-dd"))
	                .sendKeys("02");
	        Thread.sleep(500);

	        driver.findElement(By.id("undefined-yyyy"))
	                .sendKeys("2001");
	        Thread.sleep(500);

	        

	        driver.findElement(By.id("reg-submit-button"))
	                .click();

	        Thread.sleep(5000);

	      

	        System.out.println("Form submitted successfully");
	      

	        Thread.sleep(10000);

	        driver.quit();
	    }
	}


