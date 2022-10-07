package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_null 
{
	
		@Test                                             //Test Case/Test Method
		public void assertnull() 
		{	
			String ActualResult=null;	
			Assert.assertNull(ActualResult);
			
		}
		
		@Test                                             //Test Case/Test Method
		public void assertnull1() 
		{	
			String ActualResult="abcd";	
			Assert.assertNull(ActualResult);
		}	

}
