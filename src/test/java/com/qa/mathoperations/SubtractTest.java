package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {

	@Test
	public void test() {
		Subtractor subtractor = new Subtractor();
		int actual = subtractor.subtract(4,1);
		Assert.assertEquals(3, actual);
	}

}
