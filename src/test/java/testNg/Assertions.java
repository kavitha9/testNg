package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	@Test
	public void test1() {
		Assert.assertTrue(true);
		Assert.assertTrue(true, "its true");

	}

	@Test
	public void test2() {
		Assert.assertFalse(true);

	}

	@Test
	public void test3() {
		Assert.assertEquals("test2", "test");

	}

	@Test
	public void test4() {
		Assert.assertEquals("test1", "test1");

	}

	@Test
	public void test5() {
		Assert.assertTrue(false, "condition not matching");

	}

	@Test
	public void test6() {

		Assert.assertFalse(false, "false was expected");

	}
	
	@Test
	public void test7() {
		Assert.assertNotEquals("test","test1");
	}

}
