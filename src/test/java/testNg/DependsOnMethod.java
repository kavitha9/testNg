package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	@Test
	public void test1() {
		Assert.assertEquals("test1", "test1");
		
	}
	
	@Test(dependsOnMethods="test1")
	public void test2() {
		Assert.assertNotEquals("test", "test1");
		
	}

	@Test(dependsOnMethods= {"test1","test2"})
	public void test3() {
		
	}
	
	@Test
	public void test4() {
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods= {"test4"})
	public void test5() {
		
	}
	
	@Test
	public void test6() {
		
	}
}
