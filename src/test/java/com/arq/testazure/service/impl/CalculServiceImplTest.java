package com.arq.testazure.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.arq.testazure.service.CalculService;

public class CalculServiceImplTest {
	
	CalculService calculService = new CalculServiceImpl();

	@Test
	public void testProcessAdd() {
		int x=2,y=3,result=0, expectedResult=6;
		result=calculService.processAdd(x, y);
		assertEquals(expectedResult,result);
	}

	@Test
	public void testProcessSubtract() {
		int x=5,y=3,result=0, expectedResult=2;
		result=calculService.processSubtract(x, y);
		assertEquals(expectedResult,result);
	}

	@Test
	public void testProcessMultiply() {
		int x=2,y=3,result=0, expectedResult=6;
		result=calculService.processMultiply(x, y);
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void testProcessDivide() {
		int x=8,y=4,result=0, expectedResult=2;
		try {
			result=calculService.processDivide(x, y);
			assertEquals(expectedResult,result);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test(expected=Exception.class)
	public void testProcessDivideByZero() throws Exception {
		int x=1,y=0,result=0;
			result=calculService.processDivide(x, y);
			fail("Must throw an exception");
		}
}
