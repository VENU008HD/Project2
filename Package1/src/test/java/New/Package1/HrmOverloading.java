package New.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmOverloading {
	public void kiko()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftFiles\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
      
        driver.findElement(By.linkText("PIM")).click();
	}
	
	public void meth1(String s)
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftFiles\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver;
		//driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
      
        driver.findElement(By.linkText("PIM")).click();
        
        driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys(s);
        
        driver.findElement(By.id("searchBtn")).click();
		
        
        	}
	public void meth1(String s, String e)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftFiles\\chromedriver_win32\\chromedriver.exe");
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
       // driver.findElement(By.name("txtPassword")).sendKeys("admin123");
       // driver.findElement(By.name("Submit")).click();
      
       // driver.findElement(By.linkText("PIM")).click();
        
        driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys(s);
        driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys(e);
        driver.findElement(By.id("searchBtn")).click();		
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		HrmOverloading obj= new HrmOverloading();
        obj.kiko();
		obj.meth1("odis");
         obj.meth1("odis" , "Linda Jane Anderson");
      
	}

}
