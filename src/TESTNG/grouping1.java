package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class grouping1 
{
	@Test(groups="login")
	public void tc1()
	{
		Reporter.log("runing tc1",true);
	}
	@Test(groups="login")
	public void tc2()
	{
		Reporter.log("runing tc2",true);
	}
	@Test(groups="profile")
	public void tc3()
	{
		Reporter.log("runing tc3",true);
	}
	@Test(groups="profile")
	public void tc4()
	{
		Reporter.log("runing tc4",true);
	}
	@Test (groups="fund")
	public void tc5()
	{
		Reporter.log("runing tc5",true);
	}
	@Test(groups="order")
	public void tc6()
	{
		Reporter.log("runing tc6",true);
	}

}
