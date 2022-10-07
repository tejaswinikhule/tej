package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword5
{
	@Test
	public void tc1()
	{
		Reporter.log("running tc1",true);
	}

	@Test(timeOut=6000)
	public void tc2() throws InterruptedException
	{
		Thread.sleep(7000);
		Reporter.log("running tc2",true);             //7sec it will wait
	}
}
