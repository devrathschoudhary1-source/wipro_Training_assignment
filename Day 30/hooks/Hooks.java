package hooks;


import org.openqa.selenium.chrome.ChromeDriver;
 
import project.Base_class;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Hooks  extends Base_class
{
 
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
	}
	@After
	public void teardown()
	{
		driver.quit();
		System.out.println("Browser Closed");
	}
}