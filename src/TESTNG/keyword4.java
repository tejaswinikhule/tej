package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword4 
{

	@Test
	public void login()
	{
		Reporter.log("login",true);
	}
	@Test(dependsOnMethods= {"login"})
	public void logout()
	{
		Reporter.log("logout",true);
	}
}
