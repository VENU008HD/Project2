package New.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
      
        driver.findElement(By.linkText("PIM")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("odis");
        driver.findElement(By.id("searchBtn")).click();
        String expectedResult="odis";
        
        
        String actualResult=driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
        Assert.assertEquals(expectedResult,actualResult);
        driver.close();
	}

}
