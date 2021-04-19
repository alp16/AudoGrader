import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.AfterClass;

@RunWith(Suite.class)
@SuiteClasses({ Assignment6PositiveTest.class })

public class AllTests {
	/**
	 * Executed after all tests of the test suite have been executed. Student
	 * submission would use a "normal" AllTest.java that would then be replaced by a
	 * version that adds the afterClass() method.
	 */
	@AfterClass
	public static void afterClass() {
		ResultStorageSingleton results = ResultStorageSingleton.getInstance();
		System.out.println(results.getLogicalRemaining() + " concrete test cases made");
		System.out.println("a<0 Tested " + results.getTC1()+ " Times");
		System.out.println("(c-a)>b Tested " + results.getTC2()+ " Times");
		System.out.println("(c-a)<b Tested " + results.getTC3()+ " Times");
		// TODO: @Helmut: Check that student test suite gives a green bar. (Could be done via, e.g., a TestListener)
		
	}
}