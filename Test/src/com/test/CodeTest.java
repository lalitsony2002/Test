package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CodeTest {
	
  WebDriver driver = new ChromeDriver();
	

	
	
	@Test
	 public void launch()
	{
		TestNG_Code obj = new TestNG_Code(driver);
		obj.drivetest();
		System.out.println("Lauch Method Run");
	}
	@Test
	public void test1()
	{
		System.out.println("Hello Test1 method");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Hello Test2 method");
		//return new TestNG_Code(driver);
	}
	
}
