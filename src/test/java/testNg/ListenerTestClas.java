package testNg;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerTestClas {
	
	int i=0;

	@Test
	public void test1() {

	}

	@Test
	public void test2() {
		
		throw new SkipException("skipping test2");

	}

	@Test(successPercentage=60,invocationCount =5)
	public void test3() {
		
		i++;
		System.out.println("test3 test method ,invocation count :"+ i);
		
		if(i==1|| i==2) {
			System.out.println("test3 failed");
			Assert.assertEquals(i,4);
		}

	}
}
