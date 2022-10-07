package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_equls 
{
	public class Test1 
	{
		@Test                                             //Test Case/Test Method
		public void assertequals() 
		{	
			String ActualResult="Hi";	
			String ExpectedResult="Hi";
			Assert.assertEquals(ActualResult,ExpectedResult); //Hi  Hi	
		}
		
		@Test                                             //Test Case/Test Method
		public void assertequals1() 
		{
			String ActualResult="hi";
			String ExpectedResult="Hi";
			Assert.assertEquals(ActualResult,ExpectedResult,"Failed:both results are different"); //hi  Hi
		}
		
		
		
		
		
		

	}

}
