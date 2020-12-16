package testNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Parameters {
	
	@Test
	@org.testng.annotations.Parameters({"data1","data2"})
	public void test1(@Optional("default1")String data1,@Optional("default2")String data2) {
		
		System.out.println(data1);
		System.out.println(data2);
		
	}

}
