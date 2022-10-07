package POM_ddf_Testng_Baseclass_utilityclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kiteTestClass  extends Base_class
{
	private static final String expected = null;
	kitelogin12 login1;
	kitelogin23 login2;
	kitehomepage1 homepage;

	 
	@BeforeClass                             //start cond
	public void open_browser() throws InterruptedException
	{
		initializeBrowser();
		
		//create object of pom1 
		login1=new kitelogin12(driver);
		
		//create object of pom1 
	    login2=new kitelogin23(driver);
	    
	  //create object of pom1 
	  	homepage=new kitehomepage1(driver);
	  	     Thread.sleep(5000);
	
	}

	
	  	
	@BeforeMethod	
	public void  logintoApp() throws IOException, InterruptedException
	{
		Thread.sleep(8000);
		login1.userid(utility_class.getdatafromPF("un1"));
		login1.password(utility_class.getdatafromPF("psw1"));
		login1.loginbtn();

		Thread.sleep(8000);
		login2.pin(utility_class.getdatafromPF("pin1"));
		login2.ctnbtn();
	
	}
	@Test
	public void verify_user_id() throws EncryptedDocumentException, IOException
	{
		//actual userid
		String ActualUserid =homepage.VerifyuserId();
		//expected userid
		String expectedUserid=utility_class.getTD(0,3);
		
		Assert.assertEquals(ActualUserid, expectedUserid);
		
		
	}
	@AfterMethod                       //post_cond
	public void logout (ITestResult Result) throws InterruptedException, IOException
	{
		if(Result.getStatus()==ITestResult.FAILURE);         //fail==fail
		{
			utility_class.CaptureScreenshot(driver);
			
		}
		homepage.clickuserid();
		homepage.clicklogout();
		
	}
	@AfterClass
	public void closebrowser()         //end cond
	{
		driver.close();
	}
	
	
	
	
	
	

}
