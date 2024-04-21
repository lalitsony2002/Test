package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNG_Code {
	
	
	static WebDriver driver;
	
	public TestNG_Code(WebDriver driver) {
		TestNG_Code.driver=driver;
	}
	
	@Test()
	public static void hello()
	{
		System.out.println("Hello");
	}
	
	@Test()
	public void drivetest() {
		
		System.out.println("Hello In Drive Method");
		
		
	}

}
