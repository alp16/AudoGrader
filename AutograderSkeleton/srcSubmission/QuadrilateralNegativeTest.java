import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuadrilateralNegativeTest {
	Quadrilateral quadrilateral;

	@Before
	public void setUp()  {
		quadrilateral = new Quadrilateral();
	}
	
	// Testing if one parameter is > 0
	@Test(expected = InvalidParameterException.class)
	public void testNegativeAlpha() throws Exception {
		quadrilateral.classify(-10, 40, 30, 300);
		
	}
	
	@Test(expected = InvalidParameterException.class)
	public void testNegativeBeta() throws Exception {
		quadrilateral.classify(40, -10, 30, 300);	
	}
	
	@Test(expected = InvalidParameterException.class)
	public void testNegativeGamma() throws Exception {
		quadrilateral.classify(40, 30, -10, 300);
	}
	
	@Test(expected = InvalidParameterException.class)
	public void testNegativeDelta() throws Exception {
		quadrilateral.classify(40, 300, 30, -10);
	}
	
	
	// Testing if one parameter = 0
	@Test(expected = InvalidParameterException.class)
	public void testZeroAlpha() throws Exception {
		quadrilateral.classify(0, 50, 30, 300);
	}
	@Test(expected = InvalidParameterException.class)
	public void testZeroBeta() throws Exception {
		quadrilateral.classify(50, 0, 30, 300);
	}
	@Test(expected = InvalidParameterException.class)
	public void testZeroGamma() throws Exception {
		quadrilateral.classify(50, 30, 0, 300);
	}
	@Test(expected = InvalidParameterException.class)
	public void testZeroDelta() throws Exception {
		quadrilateral.classify(50, 30, 300, 0);
	}

	
	// Testing all parameters < 0
	@Test(expected = InvalidParameterException.class)
	public void testWronglyIgnoringDefectMasking() throws Exception {
		quadrilateral.classify(-10, -40, -30, -300);
	}
	
	// Testing angle >360
	@Test(expected = InvalidParameterException.class)
	public void testLargeAngle() throws Exception {
		quadrilateral.classify(100, 100, 100, 100);	
	}
	// Testing angle < 360
	@Test(expected = InvalidParameterException.class)
	public void testSmallAngle() throws Exception {
		quadrilateral.classify(50, 50, 50, 50);	
	}
	
	// Testing if parameter = 180
	@Test(expected = InvalidParameterException.class)
	public void test180Alpha() throws Exception {
		quadrilateral.classify(180, 50, 30, 100);	
	}

	@Test(expected = InvalidParameterException.class)
	public void test180Beta() throws Exception {
		quadrilateral.classify(50, 180, 30, 100);	
	}
	

	@Test(expected = InvalidParameterException.class)
	public void test180Gamma() throws Exception {
		quadrilateral.classify(30, 50, 180, 100);	
	}
	
	@Test(expected = InvalidParameterException.class)
	public void test180Delta() throws Exception {
		quadrilateral.classify(100, 50, 30, 180);	
	}
	
	
	
}
