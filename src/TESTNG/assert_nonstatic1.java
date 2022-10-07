package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert_nonstatic1 
{          //if one tc are failed it dont affect tothe other excution
	@Test
	public void tc1()
	{
		SoftAssert soft=new SoftAssert();
		String s1="hi";
		String s2="hello";
		String s3="gm";

		soft.assertNotEquals(s1, s2);
		//verfication-->pass
		soft.assertEquals(s1, s2);
		//verfication-->fail
		soft.assertNotEquals(s1, s3);
		//verfication-->pass
		soft.assertEquals(s1, s3);
		//verfication-->pass
		
	}

}
