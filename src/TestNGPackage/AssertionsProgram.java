package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertionsProgram {
	
	@Test
	public static void demo()
	{
		String a="Velocity";
		String b="Velocity";
		
		String c=null;
		
		//Assert.assertEquals(a, b);
		
		//Assert.assertNotEquals(a,b, c);
		
		//Assert.assertNotNull(c);
		
		//Assert.assertNull(c);
		
		Assert.assertTrue(true);
		
		//SoftAssert s=new SoftAssert();
		
		//s.assertEquals(a, b);
		
		//s.assertNotEquals(a, b);
		
		//s.assertNotNull(b);
		
		//s.assertNull(c);
		
		
		
		
	}

}
