package com.RegexTest.program;

import org.junit.Assert;
import org.junit.Test;

public class JunittestRegexClassUC11 {
	@Test
	public void RegexUseEmailIdEqualResultTrueorFalse() {
		//TEST-1
		RegexClassUC11 obj=new RegexClassUC11();
		// pass Test
		boolean test=obj.Email("abc.xyz@bl.co.in", "[abc]{3}[.]{1}[xyz]*[@]{1}[bl]{2}[.]{1}[co]{2}[.]{1}[in]*");
		Assert.assertEquals(true, test);
		// Fail Test
		boolean test1=obj.Email("abc.xyz@bl.co.in", "[abc]{3}[.]{1}[xyz]*[@]{1}[bl]{2}[.]{1}[co]{2}[.]{1}[in]*");
		Assert.assertEquals(false, test1);

		// TEST-2
		RegexClassUC11 obj1=new RegexClassUC11();
		//Pass Test
		boolean test2=obj1.Email("abc-100@abc.net", "[abc]{3}[-]{1}[100]{3}[@]{1}[abc]{3}[.]{1}[net]{3}");
		Assert.assertEquals(true, test2);
		// Fail Test
		boolean test3=obj1.Email("abc-100@abc.net", "[abc]{3}[-]{1}[100]{3}[@]{1}[abc]{3}[.]{1}[net]{3}");
		Assert.assertEquals(false, test3);
	}
}
