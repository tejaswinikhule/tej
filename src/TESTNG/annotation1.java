package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation1 
{
	@BeforeClass
	public void open_browser()
	{
		Reporter.log("open browser", true);
	}
	@BeforeMethod
	public void  logintoApp()
	{
		Reporter.log("login to app", true);
	}
	@Test
	public void tc1()
	{
		Reporter.log("running tc1",true);
		
	}
	@AfterMethod
	public void logout ()
	{
		Reporter.log("logout app",true);
	}
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("close browser");
	}
	
	
	
	
	
	
	
	
	
	
}