package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class diaabled2 
{
	@Test
	public void tc1()
	{
		Reporter.log("running tc1",true);
	}
	@Test
	public void tc2()
	{
		Reporter.log("running tc2",true);
	}
	
	@Test
	public void tc3()       // to disabled tc3 from test suite  so first go to the testsng convertor in .xml file  write exclude  method in class
	{
		Reporter.log("running tc3",true);   // see that in disabled 2
	}
	


}
