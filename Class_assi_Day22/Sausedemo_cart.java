package Class_assi_Day22;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Sausedemo_cart {

	    public static void main(String[] args) throws InterruptedException {

	        
	        WebDriver driver = new ChromeDriver();

	      
	        driver.get("https://www.saucedemo.com/");

	      
	        driver.manage().window().maximize();

	        
	        WebElement username = driver.findElement(By.id("user-name"));
	        username.sendKeys("standard_user");

	      
	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys("secret_sauce");

	       
	        WebElement loginBtn = driver.findElement(By.id("login-button"));
	        loginBtn.click();

	     
	        Thread.sleep(2000);

	    
	        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	        addToCart.click();

	       
	        Thread.sleep(2000);

	        
	        WebElement cart = driver.findElement(By.className("shopping_cart_link"));
	        cart.click();

	      
	        Thread.sleep(2000);

	        
	        System.out.println("Product added to cart successfully!");

	        
	        driver.quit();
	    }
	}


