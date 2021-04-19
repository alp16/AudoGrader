/**
 * Class for storing results from the class that gets tested be the submitted
 * JUnit tests.
 * 
 * This class uses the singleton design pattern, so that it can be used by all
 * instance of the class that gets tested. => Instantiate via getInstance()
 * 
 *
 */
public class ResultStorageSingleton {
	private static ResultStorageSingleton theInstance = null;

	
	private int logicalRemaining;
	
	private int TC1;
	private int TC2;
	private int TC3;
	

	public static ResultStorageSingleton getInstance() {
		if (theInstance == null) { // Lazy instantiation
			theInstance = new ResultStorageSingleton();
		}
		return theInstance; 
	}

	protected ResultStorageSingleton() { // Class may not be instantiated by others
		
	};

	
	/**
	 * Return how often the classify method was called with some parameter < 0
	 */
	public int getLogicalRemaining() {
		return logicalRemaining;
	};


	/**
	 * Increment how often the classify method was called with some parameter < 0
	 */
	public void incrLogicalReimining() {
		logicalRemaining++;
	}
	
	/**
	 * Return how often the classify method was called with some parameter < 0
	 */
	public int getTC1() {
		return TC1;
	};


	/**
	 * Increment how often the classify method was called with some parameter < 0
	 */
	public void incrTC1() {
		TC1++;
	}
	
	/**
	 * Return how often the classify method was called with some parameter < 0
	 */
	public int getTC2() {
		return TC2;
	};


	/**
	 * Increment how often the classify method was called with some parameter < 0
	 */
	public void incrTC2() {
		TC2++;
	}
	
	/**
	 * Return how often the classify method was called with some parameter < 0
	 */
	public int getTC3() {
		return TC3;
	};


	/**
	 * Increment how often the classify method was called with some parameter < 0
	 */
	public void incrTC3() {
		TC3++;
	}

}
