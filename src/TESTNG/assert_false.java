package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_false 
{
	
		@Test                                             //Test Case/Test Method
		public void assertfalse() 
		{	
			boolean ActualResult=true;		
			Assert.assertFalse(ActualResult);
		}
		

		@Test                                             //Test Case/Test Method
		public void assertfalse1() 
		{	
			boolean ActualResult=false;	
			Assert.assertFalse(ActualResult);
		}
		
		

}
