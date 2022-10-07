package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword1 
{

	@Test(invocationCount=5)              //test case  run 5 times
	public void tc1()
	{
		Reporter.log("running tc1",true);
	}

}
