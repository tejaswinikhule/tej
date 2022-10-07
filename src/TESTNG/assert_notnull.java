package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_notnull 
{
	@Test                                             //Test Case/Test Method
	public void assertnull() 
	{	
		String ActualResult=null;	
		Assert.assertNotNull(ActualResult);
		
	}
	
	@Test                                             //Test Case/Test Method
	public void assertnull1() 
	{	
		String ActualResult="abcd";	
		Assert.assertNotNull(ActualResult);
	}	


}
