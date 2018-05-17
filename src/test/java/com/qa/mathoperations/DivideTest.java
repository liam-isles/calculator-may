package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;



public class DivideTest {

	@Test
	public void test() {
		Divider divider = new Divider();
		int actual = divider.divide(20,2);
		Assert.assertEquals(10, actual);
	}

}
