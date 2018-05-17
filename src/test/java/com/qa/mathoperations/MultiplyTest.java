package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		Multiplier multiplier = new Multiplier();
		int actual = multiplier.multiply(5,6);
		Assert.assertEquals(30, actual);
	}

}
