package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_static 
{              // in hard assert if some tc are failed then next excution not happen
	@Test
	public void tc1()
	{
		String s1="hi";
		String s2="hello";
		String s3="gm";

		Assert.assertNotEquals(s1, s2);
		//verfication-->pass
		Assert.assertEquals(s1, s2);
		//verfication-->fail
		Assert.assertNotEquals(s1, s3);
		//verfication-->pass
		Assert.assertEquals(s1, s3);
		//verfication-->pass
		
	}

}
