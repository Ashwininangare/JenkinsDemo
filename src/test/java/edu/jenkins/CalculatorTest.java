package edu.jenkins;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator calculator = null;

	@BeforeClass
	public void beforeClass() {
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(calculator.add(5, 15), 20);
	}

	@Test
	public void testSubstract() {
		Assert.assertEquals(calculator.substract(10, 5), 5);
	}

	@Test
	public void testMultiply() {
		Assert.assertEquals(calculator.multiply(10, 5), 50);
	}

	@Test
	public void testDivide() {
		Assert.assertEquals(calculator.divide(10, 5), 2);
	}
}
