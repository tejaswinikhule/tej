package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_true 
{
	 
	
		@Test                                             //Test Case/Test Method
		public void asserttrue() 
		{	
			boolean ActualResult=true;		
			Assert.assertTrue(ActualResult);
		}
		

		@Test                                             //Test Case/Test Method
		public void asserttrue1() 
		{	
			boolean ActualResult=false;	
			Assert.assertTrue(ActualResult);
		}
		
	

}
