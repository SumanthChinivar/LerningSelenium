package configurationAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningConfigAnnotation5 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void test1()
	{
		System.out.println("@Test Method 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("@Test Method2");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
}
