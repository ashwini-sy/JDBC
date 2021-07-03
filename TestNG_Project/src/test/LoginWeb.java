package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginWeb {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	@Test
	public void test() {
		// TODO Auto-generated method stub		
		System.getProperty("key", "chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		
		report=new ExtentReports("Extendreport.html");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		System.out.println(driver.getTitle());
		//Click on search link
		test=report.startTest("Login page");
		driver.findElement(By.xpath("//div[@class='search_topbar']")).click();
		//Login button
		test.log(LogStatus.PASS,"Clicked login button successfully:");
		driver.findElement(By.linkText("Log in")).click();
		//username
	    driver.findElement(By.name("user_login")).sendKeys("abc@gmail.com");
		
		report.endTest(test);
		report.flush();
		driver.close();
		
		
	}	
	

}
