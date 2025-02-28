package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest
{
	Calculator calcObj = new Calculator();

	// Tests for Square Root Function
	@Test
	public void testSquareRoot()
	{
		// Test 1
		assertEquals((Double) 4.0, calcObj.findSquareRoot(16.0));

		// Test 2
		assertEquals((Double) 0.0, calcObj.findSquareRoot(0.0));

		// Test 3
		assertEquals((Double) 9.55, calcObj.findSquareRoot(91.2025));

		// Test 4
		assertEquals((Double) 1.0, calcObj.findSquareRoot(1.0));

		// Test 5
		assertEquals((Double) 5.225, calcObj.findSquareRoot(27.300625));
	}

	// Tests for Factorial Function
	@Test
	public void testFactorial()
	{
		// Test 1
		assertEquals((Integer) 1, calcObj.findFactorial(0));

		// Test 2
		assertEquals((Integer) 1, calcObj.findFactorial(1));
 
		// Test 3
		assertEquals((Integer) 2, calcObj.findFactorial(2));

		// Test 4
		assertEquals((Integer) 120, calcObj.findFactorial(5));

		// Test 5
		assertEquals((Integer) 3628800, calcObj.findFactorial(10));
	}

	// Tests for Natural Log Function
	@Test
	public void testNaturalLog()
	{
		// Test 1
		assertEquals((Double) 0.0, calcObj.findNaturalLog(1.0), 0.0);

		// Test 2
		assertEquals((Double) 2.302585, calcObj.findNaturalLog(10.0), 0.000001);

		// Test 3
		assertEquals((Double) 0.693147, calcObj.findNaturalLog(2.0), 0.000001);

		// Test 4
		assertEquals((Double) (-1.386294), calcObj.findNaturalLog(0.25), 0.000001);

		// Test 5
		assertEquals((Double) (-6.907755), calcObj.findNaturalLog(0.001), 0.000001);
	}

	// Tests for Power Function
	@Test
	public void testPower()
	{
		// Test 1
		assertEquals((Double) 9.0, calcObj.findPower(3.0, 2.0), 0.0);

		// Test 2
		assertEquals((Double) 1.0, calcObj.findPower(1.0, 100.0), 0.0);

		// Test 3
		assertEquals((Double) 1.0, calcObj.findPower(-3.0, 0.0), 0.0);

		// Test 4
		assertEquals((Double) 433.217393, calcObj.findPower(7.0, 3.12), 0.000001);

		// Test 5
		assertEquals((Double) (-64.0), calcObj.findPower(-4.0, 3.00), 0.000001);
	}

}
