package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsAndKeywords {

	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class method");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method ");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test method");
	}
	
	@Test (priority=1,enabled=false)
	public void test()
	{
		System.out.println("Test Method");
	}
	
	@Test(priority=-2,invocationCount=2)
	public void test1()
	{
		System.out.println("Test1 Method");

	}
	
	@Test(dependsOnMethods="test1")
	public void test2()
	{
		System.out.println("Test2 Method");

	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");

	}

}
