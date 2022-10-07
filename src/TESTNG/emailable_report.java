package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailable_report 
{
	@Test                          //test method/ test case
	public void m1()
	{
		Reporter.log("hi",true);     // print in console as well as emailable report
	}
	@Test   
	public void m2()
	{
		Reporter.log("method 2 running",true);
	
	}
	@Test   
	public void m3()
	{
		Reporter.log("method 3 running",false);
	}
	
}
