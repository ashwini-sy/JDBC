package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase_1 {
	@BeforeTest
	public void beforetestmethod()
	{
		System.out.println("Before test");
	}
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("BEfore method");
	}
	@Test
	public void logintest()
	{
	  System.out.println("Inside login test");	
	}
	
	@Test
	public void Hometest()
	{
	  System.out.println("Inside home test");	
	}
	
	@AfterMethod
	public void aftermethod()
	{
	  System.out.println("After Method");	
	}
	
	@AfterTest
	public void Aftertestmethod()
	{
		System.out.println("After test");
	}

}
