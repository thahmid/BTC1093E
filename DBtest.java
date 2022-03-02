package db;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DBtest {
	
	SoftAssert s = new SoftAssert();
	
	@DataProvider(name="login")
	public Object[][] getData(){
		Object[][] o=new Object[2][2];
		o[0][0]="user1";
		o[0][1]="P23";
		o[1][0]="user1";
		o[1][1]="P23";
		return o;
		
	}
	
	
	@Test(dataProvider="login")
	public void test5(Object b, Object c) {
		
	}
}
