

import org.junit.Before;
import org.junit.Test;

public class Assignment7NegativeTest {
	Assignment7 assignment;

	@Before
	public void setUp() {
		assignment = new Assignment7();
	}
	
	@Test(expected = InvalidParameterException.class)
	public void testNegativeColorHigh() throws Exception {
		assignment.checkFee(3,15);	
	}
	
	@Test(expected = InvalidParameterException.class)
	public void testNegativeColorLow() throws Exception {
		assignment.checkFee(-1,15);	
	}
	
	@Test(expected = InvalidParameterException.class)
	public void testNegativeDist() throws Exception {
		assignment.checkFee(0,-1);	
	}
}


