package testNg;

import org.testng.annotations.Test;

public class DataProvider {
	
	@org.testng.annotations.DataProvider
    public Object[][]dataParam(){
		
		Object[][] data=new Object[3][3];
		data[0][0]=1;
		data[0][1]="test1";
		data[0][2]="Test1";
		
		data[1][0]=2;
		data[1][1]="Test2";
		data[1][2]="test2";
		
		data[2][0]=3;
		data[2][1]="Test3";
		data[2][2]="test3";
		
		return data;
		
		}
	
	@Test(dataProvider="dataParam")
	public void testDP(int i,String s1, String s2) {
		
		
		System.out.println(i  +"......"+s1  +"......" + s2);
		
	}
	

}
