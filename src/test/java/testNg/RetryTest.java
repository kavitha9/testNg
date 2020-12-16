package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	
	int i=0;
	
	@Test
	public void test1() {
		
		if(i< 2) {
			i++;
			System.out.println("count :"+ i);
			Assert.assertTrue(false);
			}else {
				Assert.assertTrue(true);
			}
		 
	}

}
