import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Assignment6PositiveTest {
	Assignment6 assignment;
	@Before
	public void setUp() {
		assignment = new Assignment6();
	}
	/*
	@Test
	public void testLogical() {
		assertEquals(0, assignment.classify(-1, 0, 0));
		assertEquals(0,assignment.classify(1, -1, 0));
		assertEquals(0,assignment.classify(0, 0, -1));
		assertEquals(0,assignment.classify(0, 0, 1));
		assertNotEquals(0,assignment.classify(0, 0, 0));
	}
	*/
	@Test
	public void testLogicalRemaining() {
		assertEquals(0, assignment.classify(-1, 0, 0));
		assertEquals(0,assignment.classify(0, 0, 1));
		assertNotEquals(0,assignment.classify(0, 0, 0));
	}
/*
	@Test
	public void testKjaftaði() {
		assertEquals(10,assignment.classify(-11111, -4, -43443));
	}
	*/
}
