package TESTNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 
{
	@Test
	public void tc1()
	{  // Assert.fail();
		Reporter.log("running tc1",true);
		
	}
	@Test
	public void tc2()
	{
		Reporter.log("running tc2",true);
		
	}

}
