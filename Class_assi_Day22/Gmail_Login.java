
	package Class_assi_Day22;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Gmail_Login {

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();

	     
	        driver.get("https://accounts.google.com");

	
	        driver.manage().window().maximize();
	        Thread.sleep(1000);

	        
	        driver.findElement(By.id("identifierId"))
	              .sendKeys("devrathsinghchoudhary@gmail.com");
	        Thread.sleep(1000);

	        
	        driver.findElement(By.id("identifierNext"))
	              .click();
	        Thread.sleep(3000);

	       
	        driver.findElement(By.name("Passwd"))
	              .sendKeys("Dev@3002");
	        Thread.sleep(1000);

	     
	        driver.findElement(By.id("passwordNext"))
	              .click();

	       
	        System.out.println(driver.getTitle());

	        Thread.sleep(5000);

	       
	        driver.quit();
	    }
	}


