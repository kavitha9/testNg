package testNg;


import org.testng.annotations.Test;

public class GroupsInTestNg {
	
	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("sanity test");
		
	}
	
	@Test(groups= {"sanity","regression"})
	public  void test2() {
		
		System.out.println("sanity,regression");
		
	
		
	}
	
	@Test(groups= {"regression"})
	public void test3() {
		
		System.out.println("regression");
		
	}
	
	

}
