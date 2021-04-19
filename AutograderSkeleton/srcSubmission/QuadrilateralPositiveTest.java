import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuadrilateralPositiveTest {
	Quadrilateral quadrilateral;

	@Before
	public void setUp() {
		quadrilateral = new Quadrilateral();
	}

	@Test
	public void testRectangle() {
		assertEquals(QuadrilateralType.rectangle, quadrilateral.classify(90, 90, 90, 90));
	}

	@Test
	public void testIrregular() {
		assertEquals(QuadrilateralType.irregular, quadrilateral.classify(10, 20, 30, 300));
	}
	
	@Test
	public void testParallelogram() {
		assertEquals(QuadrilateralType.parallelogram, quadrilateral.classify(30, 150, 30, 150));
	}
	
}
