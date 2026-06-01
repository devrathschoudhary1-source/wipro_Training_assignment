package class_assi_day23;


import java.io.File; 
//import java.io.File; 
import java.io.IOException; 
import java.time.Duration; 
import org.openqa.selenium.Alert; 
import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot; 
//import org.openqa.selenium.OutputType; 
//import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 
import org.openqa.selenium.io.FileHandler; 
//import org.openqa.selenium.io.FileHandler; 
import org.openqa.selenium.support.ui.Select; 
import org.openqa.selenium.support.ui.WebDriverWait; 
public class Complete_Automation { 
 
 public static void main(String[] args) throws InterruptedException, IOException { 
  WebDriver driver = new ChromeDriver(); 
  // url 
  driver.get("https://testautomationpractice.blogspot.com/"); 
  // window maximize 
  driver.manage().window().maximize(); 
  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25)); 
  JavascriptExecutor js=(JavascriptExecutor)driver; 
  //for name 
  WebElement name = driver.findElement(By.id("name")); 
  name.sendKeys("Devrath Singh "); 
  Thread.sleep(2000); 
  //for email 
  WebElement email = driver.findElement(By.id("email")); 
  email.sendKeys("nk1711336@gmail.com"); 
  Thread.sleep(2000); 
  //for phone number 
  WebElement phone = driver.findElement(By.id("phone")); 
  phone.sendKeys("9876543216"); 
  Thread.sleep(2000); 
  //for address 
  WebElement address = driver.findElement(By.id("textarea")); 
  address.sendKeys("kolkata"); 
  Thread.sleep(2000); 
   
  //for gender 
  driver.findElement(By.id("male")).click(); 
  Thread.sleep(2000); 
  // for day 
  driver.findElement(By.id("sunday")).click(); 
  Thread.sleep(1000); 
  driver.findElement(By.id("monday")).click(); 
  Thread.sleep(1000); 
  //for country 
  WebElement country = driver.findElement(By.id("country")); 
  Select sel = new Select(country); 
  sel.selectByVisibleText("India"); 
  Thread.sleep(2000); 
  //for colors 
  WebElement colors = driver.findElement(By.id("colors")); 
  Select col = new Select(colors); 
  col.selectByVisibleText("Red"); 
  Thread.sleep(2000); 
 
   
  WebElement animals = driver.findElement(By.id("animals")); 
  Select ani = new Select(animals); 
 
  ani.selectByVisibleText("Cat"); 
  ani.selectByVisibleText("Dog"); 
  Thread.sleep(2000); 
  // Date 1 
  WebElement date1 = driver.findElement(By.id("datepicker")); 
  date1.click(); 
  date1.sendKeys("10/11/2002"); 
  Thread.sleep(2000); 
 
   //Date 2 
 
  driver.findElement(By.id("txtDate")).click(); 
  WebElement month = driver.findElement(By.className("ui-datepickermonth")); 
  Select mon = new Select(month); 
  mon.selectByVisibleText("May"); 
  WebElement year = driver.findElement(By.className("ui-datepickeryear")); 
  Select yr = new Select(year); 
  yr.selectByVisibleText("2026"); 
  driver.findElement(By.xpath("//a[text()='16']")).click(); 
  Thread.sleep(2000); 
   
  /*driver.findElement(By.id("txtDate")).click(); // for opening date format 
  driver.findElement(By.xpath("//*[@id=\"ui-datepicker
div\"]/div/div/select[2]/option[11]")).click(); 
  driver.findElement(By.xpath("//*[@id=\"ui-datepicker
div\"]/div/div/select[1]/option[5]")).click(); 
  driver.findElement(By.xpath("//*[@id=\"ui-datepicker
div\"]/table/tbody/tr[2]/td[3]/a")).click();*/ 
  // Date 3 
  WebElement date3 = driver.findElement(By.id("start-date")); 
  date3.sendKeys("16/05/2003"); 
 
  WebElement date4 = driver.findElement(By.id("end-date")); 
  date4.sendKeys("20/05/2006"); 
  driver.findElement(By.xpath("//button[text()='Submit']")).click(); 
  Thread.sleep(2000); 
   
 
   
   
   
  // uploading images 
 
  WebElement img = driver.findElement(By.id("singleFileInput")); 
 
  // scroll to upload section 
  js.executeScript("arguments[0].scrollIntoView(true);", img); 
 
  Thread.sleep(2000); 
 
  img.sendKeys("C:\\Users\\nk171\\OneDrive\\Pictures\\Camera Roll\\7823211d2e22d9b905fd7c024d71f2df.jpg"); 
 
  WebElement mulimg2 = driver.findElement(By.id("multipleFilesInput")); 
 
  mulimg2.sendKeys( "C:\\Users\\nk171\\OneDrive\\Pictures\\Camera Roll\\flat,750x1000,075,t.jpg" 
  + "\n" + "C:\\Users\\nk171\\OneDrive\\Pictures\\Camera Roll\\7823211d2e22d9b905fd7c024d71f2df.jpg" 
  ); 
 
  Thread.sleep(2000); 
  //js.executeScript("window.scrollBy(0,700)"); 
   
  // dynamic button 
  /*WebElement 
dcc=driver.findElement(By.xpath("//button[@class=\"start\"]"));// only applicable for 
xpath not css selector 
  Thread.sleep(5000); 
  Actions ac=new Actions(driver); 
  ac.moveToElement(dcc).perform(); 
  Thread.sleep(7000); 
   
  WebElement 
sc=driver.findElement(By.xpath("//button[@class=\"stop\"]"));// only applicable for 
xpath not css selector 
  Thread.sleep(5000); 
  ac.moveToElement(sc).perform(); 
  Thread.sleep(7000);*/ 
   
  //dynamic button 
    js.executeScript("window.scrollBy(0,900)"); 
  Thread.sleep(2000); 
 
  WebElement dynamicButton = 
driver.findElement(By.xpath("//button[text()='START']")); 
  dynamicButton.click(); 
 
  Thread.sleep(3000); 
 
  WebElement stopButton = 
driver.findElement(By.xpath("//button[text()='STOP']")); 
  stopButton.click(); 
  // sample alert 
  driver.findElement(By.id("alertBtn")).click(); 
  Actions ac=new Actions(driver); 
  Thread.sleep(5000); 
  driver.switchTo().alert().accept(); 
 
   
  ////confirmation alert 
  driver.findElement(By.id("confirmBtn")).click(); 
  Thread.sleep(5000); 
  driver.switchTo().alert().dismiss(); 
  Thread.sleep(5000); 
   
  // prompt alert 
   
  driver.findElement(By.id("promptBtn")).click(); 
  Alert alert=driver.switchTo().alert(); 
  alert.sendKeys("welcome"); 
  Thread.sleep(3000); 
  alert.accept(); 
  Thread.sleep(3000); 
   
  //Mouse Hover 
 
  Actions act = new Actions(driver); 
 
  js.executeScript("window.scrollBy(0,500)"); 
  Thread.sleep(2000); 
 
  WebElement pointMe = 
driver.findElement(By.xpath("//button[text()='Point Me']")); 
  act.moveToElement(pointMe).perform(); 
 
  Thread.sleep(2000); 
 
  WebElement mobiles = 
driver.findElement(By.xpath("//a[text()='Mobiles']")); 
  mobiles.click(); 
 
  Thread.sleep(2000); 
       
    //Double Click 
     // js.executeScript("window.scrollBy(0,500)"); 
      Thread.sleep(2000); 
 
      WebElement field1 = driver.findElement(By.id("field1")); 
      field1.clear(); 
      field1.sendKeys("Nitesh Kumar"); 
      Thread.sleep(2000); 
      WebElement copyButton = driver.findElement(By.xpath("//button[text()='Copy Text']")); 
      ac.doubleClick(copyButton).perform(); 
 
      Thread.sleep(2000); 
       
      // taking screenshot 
    TakesScreenshot tc=(TakesScreenshot)driver; 
   File sc=tc.getScreenshotAs(OutputType.FILE); 
    
   //file handling 
   File dest=new File("DemoQAform2.png"); 
      FileHandler.copy(sc, dest); 
   Thread.sleep(5000); 
   driver.quit(); 
   driver.close(); 
       
    //slider 
      WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'uislider-handle')]")); 
 
      act.dragAndDropBy(slider, 80, 0).perform(); 
 
      Thread.sleep(2000); 
 
 
      // Drag and Drop 
 
      js.executeScript("window.scrollBy(0,500)"); 
      Thread.sleep(2000); 
 
      WebElement drag = driver.findElement(By.id("draggable")); 
      WebElement drop = driver.findElement(By.id("droppable")); 
 
      act.dragAndDrop(drag, drop).perform(); 
 
      Thread.sleep(2000); 
 
 
      //dropdown box 
 
 
      js.executeScript("window.scrollBy(0,600)"); 
      Thread.sleep(2000); 
 
      driver.findElement(By.id("comboBox")).click(); 
      Thread.sleep(1000); 
 
      WebElement dropdownItem = 
driver.findElement(By.xpath("//div[contains(text(),'Item 50')]")); 
 
      js.executeScript("arguments[0].scrollIntoView(true);", dropdownItem); 
      Thread.sleep(1000); 
 
      dropdownItem.click(); 
 
      Thread.sleep(2000); 
     
 
 } 
}