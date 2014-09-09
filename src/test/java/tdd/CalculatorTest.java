package tdd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
	
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	@After
	public void tearDown(){
		
	}
	@Test
	public void testAdd() {
		assertEquals(5,(int)calculator.add(2,3));
	}
	@Test
	public void testMinus() {
		assertEquals(-1,(int)calculator.minus(2,3));
	}
	@Test
	public void testMulti() {
		assertEquals(6,(int)calculator.multi(2,3));
	}
	@Test
	public void testDevide() {
		assertTrue((5 == (double)calculator.devide(10,2)));
	}
	@Test
	public void testMod() {
		assertEquals(2, calculator.mod(2,3));
	}
}
