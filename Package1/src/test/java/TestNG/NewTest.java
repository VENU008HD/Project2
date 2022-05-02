package TestNG;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {
	@Test (enabled=true)
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","D:\\\\SeleniumSoftFiles\\\\chromedriver_win32\\\\chromedriver.exe");
	  WebDriver driver;
	  driver=new ChromeDriver();
	  driver.get("https://en.wikipedia.org/wiki/Main_Page");
	  driver.findElement(By.name("search")).clear();
	  driver.findElement(By.name("search")).sendKeys("india",Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[3]/ul/li[1]/div[1]/a/span")).click();
	  driver.manage().window().maximize();
	  String ActualTitle= driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText();
	  String ExpectedTitle= "India";
			  Assert.assertEquals(ExpectedTitle, ActualTitle);	
  }


}
