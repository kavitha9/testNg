package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicHrchy {

	@BeforeSuite
	public void test1() {
		
		System.out.println("beforesuite");

	}

	@BeforeTest
	public void test2() {
		System.out.println("BEFORE TEST");

	}

	@BeforeClass
	public void test3() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void test4() {
System.out.println("before method");
	}
    @Test
	public void test5() {
    	System.out.println("TEST");

	}
    
    @Test
     public void test10() {
    	System.out.println("test 10");
    	
    }
  @AfterTest
	public void test6() {
	  System.out.println("AFTER TEST");

	}
@AfterSuite
	public void test7() {
	System.out.println("after suite"); 
	

	}
@AfterMethod
	public void test8() {
	System.out.println("AFTER METHOD");

	}

}
