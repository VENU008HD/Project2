package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllTestAnotations {
	  @Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftFiles\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver= new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	      driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	      driver.findElement(By.name("Submit")).click();
	    
	      driver.findElement(By.linkText("PIM")).click();
		  System.out.println("Test cases is passed");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("BeforeMethod is passed");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("AfterMethod is passed");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("BeforeClass is passed");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println(" AfterClass is passed");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("BeforeTest is passed");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("AfterTest is passed");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("BeforeSuite is passed");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("AfterSuite is passed");
	  }

	}
