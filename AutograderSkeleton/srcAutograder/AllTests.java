import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.AfterClass;

@RunWith(Suite.class)
@SuiteClasses({ QuadrilateralNegativeTest.class, QuadrilateralPositiveTest.class })

public class AllTests {
	/**
	 * Executed after all tests of the test suite have been executed. Student
	 * submission would use a "normal" AllTest.java that would then be replaced by a
	 * version that adds the afterClass() method.
	 */
	@AfterClass
	public static void afterClass() {
		ResultStorageSingleton results = ResultStorageSingleton.getInstance();
		System.out.println("Tested with some parameter == 0: " + results.getParamZero() + " times");
		System.out.println("Tested with some parameter < 0: " + results.getParamLowerThanZero() + " times");
		System.out.println("Tested with parameter yielding rectangle: " + results.getRectangle() + " times");
		System.out.println("Tested with parameter yielding Irregular " + results.getIrregular()+ " times");
		System.out.println("Tested with parameter yielding Parallelogram "+ results.getParallelogram()+ " times");
		System.out.println("Tested with angle > 360 " + results.getAngleHigh()+ " times");
		System.out.println("Tested with angle < 360 " + results.getAngleLow()+ " times");
		System.out.println("Tested with some parameter == 180, " + results.getParam180()+ " times");
		// TODO: @Helmut: Check that student test suite gives a green bar. (Could be done via, e.g., a TestListener)
		
	}
}