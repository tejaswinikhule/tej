package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_notequls 
{
	public class Test1 
	{
		@Test                                             //Test Case/Test Method
		public void assertnotequals() 
		{	
			String ActualResult="Hi";	
			String ExpectedResult="Hi";
			Assert.assertNotEquals(ActualResult,ExpectedResult); //Hi  Hi	
		}
		
		@Test                                             //Test Case/Test Method
		public void assertnotequals1() 
		{
			String ActualResult="hi";
			String ExpectedResult="Hello";
			Assert.assertNotEquals(ActualResult,ExpectedResult,"Failed:both results are different"); //hi  Hi
		}
		
		
		
		
		
		

	}
	

}
