package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword3 
{
	@Test(priority=2)
	public void tc1()
	{
		Reporter.log("running tc1",true);
	}
	@Test(priority=1)
	public void tc2()
	{
		Reporter.log("running tc2",true);
	}
	
	@Test
	public void tc3()              //by default priority is 0
	{
		Reporter.log("running tc3",true);
	}
	@Test(enabled=false)                // that particular test case not running
	public void tc4()
	{
		Reporter.log("running tc4",true);
	}
}
