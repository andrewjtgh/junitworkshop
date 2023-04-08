package com.mtech.workshopjunit;

import static org.junit.Assert.*;
import org.junit.Test;

public class MultDivideTest {
	@Test
	public void testMultPass() {
	// assertEquals(String message, long expected, long actual)
	assertEquals("error in mult()", 2, Calculator.mul(1, 2));
	assertEquals("error in mult()", -2, Calculator.mul(-1, 2));
	assertEquals("error in mult()", 0, Calculator.mul(9, 0));
	}
	@Test
	public void testMulFail() {
	// assertNotEquals(String message, long expected, long actual)
	assertNotEquals("error in add()", 0, Calculator.mul(1, 2));
	}
	@Test
	public void testdivIntPass() {
		assertEquals("error in divInt()", 2, Calculator.divInt(2, 1));
		assertEquals("error in divInt()", -2, Calculator.divInt(-2, 1));
		assertEquals("error in divInt()", 1, Calculator.divInt(2, 2));
	}
	@Test
	public void testdivRealPass() {
		assertEquals("error in divReal()", 2.00, Calculator.divReal(2, 1),0.01);
		assertEquals("error in divReal()", -2.00, Calculator.divReal(-2, 1),0.01);
		assertEquals("error in divReal()", 1.00, Calculator.divReal(2, 2),0.01);
	}
	@Test
	public void testdivIntFail() {
	assertNotEquals("error in divInt()", 0, Calculator.divInt(2, 1));
	}
	@Test
	public void testdivRealFail() {
	assertNotEquals("error in divReal()", 0.00, Calculator.divInt(2, 1),0.01);
	}
	
	@Test
	public void testDivideByZero() {
    assertThrows(IllegalArgumentException.class,() -> { Calculator.divInt(2, 0);});
	}
	@Test
	public void testDivideByZeroReal() {
    assertThrows(IllegalArgumentException.class,() -> { Calculator.divReal(2, 0);});
	}
	
	
	}
