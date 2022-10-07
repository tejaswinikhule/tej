package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword2
{

	@Test
	public void tc1()
	{
		Reporter.log("running tc1",true);         // test case run as albhabetical order
	}
	@Test
	public void tc2()
	{
		Reporter.log("running tc2",true);
	}	
}
