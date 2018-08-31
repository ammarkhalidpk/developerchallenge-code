package challenge;

import org.junit.Test;

import com.challenge.Processor;

import junit.framework.TestCase;

public class DateCalculatorTest extends TestCase {

	private Processor executor = null;
	private String[] testOne = new String[] {"1983-06-02","1983-06-22" }; 
	private String[] testTwo = new String[] {"1984-07-04","1984-12-25" }; 
	private String[] testThree = new String[] {"1989-01-03","1983-08-03" }; 
	
	
	@Test
	public void testFullDaysCalculationCaseOne() {
		executor = new Processor(testOne);
		assertEquals(Long.valueOf(19), executor.compute());
	}
	
	@Test
	public void testFullDaysCalculationCaseTwo() {
		executor = new Processor(testTwo);
		assertEquals(Long.valueOf(173), executor.compute());
	}
	
	@Test
	public void testFullDaysCalculationCaseThree() {
		executor = new Processor(testThree);
		assertEquals(Long.valueOf(1979), executor.compute());
	}
	
}
