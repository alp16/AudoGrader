import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Assignment7PositiveTest {
	Assignment7 assignment;

	@Before
	public void setUp() {
		assignment = new Assignment7();
	}
	@Test
	public void testPositive() {
		assertEquals(16300,assignment.checkFee(0, 0));
		assertEquals(8150,assignment.checkFee(1, 15));
		assertEquals(12200,assignment.checkFee(2, 16));
		assertEquals(7400,assignment.checkFee(2, 0));
		assertEquals(21100,assignment.checkFee(0, 16));
		assertEquals(12950,assignment.checkFee(1, 16));
	}

}

