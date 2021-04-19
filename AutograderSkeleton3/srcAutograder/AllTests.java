import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.AfterClass;

@RunWith(Suite.class)
@SuiteClasses({ Assignment7NegativeTest.class, Assignment7PositiveTest.class })

public class AllTests {
	/**
	 * Executed after all tests of the test suite have been executed. Student
	 * submission would use a "normal" AllTest.java that would then be replaced by a
	 * version that adds the afterClass() method.
	 */
	@AfterClass
	public static void afterClass() {
		ResultStorageSingleton results = ResultStorageSingleton.getInstance();
		
		System.out.println("Tested with Price 16300: " + results.getFee16300() + " times");
		System.out.println("Tested with Price 21100: " + results.getFee21100() + " times");
		System.out.println("Tested with Price 8150: " + results.getFee8150() + " times");
		System.out.println("Tested with Price 12950: " + results.getFee12950() + " times");
		System.out.println("Tested with Price 7400: " + results.getFee7400() + " times");
		System.out.println("Tested with Price 12200: " + results.getFee12200() + " times");
		
		System.out.println("Tested with Color = -1: " + results.getcColorBorderLow() + " times");
		System.out.println("Tested with Color < 0: " + results.getColorLow() + " times");
		
		System.out.println("Tested with Color = 3: " + results.getcColorBorderLow() + " times");
		System.out.println("Tested with Color > 2: " + results.getColorHigh() + " times");
		
		System.out.println("Tested with Distance = -1: " + results.getDistBorder() + " times");
		System.out.println("Tested with Distance = 16: " + results.getDistBorderOver() + " times");
		System.out.println("Tested with Distance = 0 or Distance = 15: " + results.getDistBorderOver() + " times");
		System.out.println("Tested with Distance < 0: " + results.getDist() + " times");
		
		
		
		// TODO: @Helmut: Check that student test suite gives a green bar. (Could be done via, e.g., a TestListener)
		
	}
}