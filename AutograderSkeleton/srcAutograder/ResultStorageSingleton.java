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

	private int paramZero;

	private int paramLowerThanZero;

	private int rectangle;
	
	private int parallelogram;
	
	private int irregular;
	
	private int param180;
	
	private int angleLow;
	
	private int angleHigh;

	public static ResultStorageSingleton getInstance() {
		if (theInstance == null) { // Lazy instantiation
			theInstance = new ResultStorageSingleton();
		}
		return theInstance;
	}

	protected ResultStorageSingleton() { // Class may not be instantiated by others
	};

	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getParamZero() {
		return paramZero;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrParamZero() {
		paramZero++;
	}

	/**
	 * Return how often the classify method was called with some parameter < 0
	 */
	public int getParamLowerThanZero() {
		return paramLowerThanZero;
	};


	/**
	 * Increment how often the classify method was called with some parameter < 0
	 */
	public void incrParamLowerThanZero() {
		paramLowerThanZero++;
	}


	/**
	 * Return how often the classify method was called with parameter yielding a rectangle
	 */
	public int getRectangle() {
		return rectangle;
	}

	/**
	 * Increment how often the classify method was called with parameter yielding a rectangle
	 */
	public void incrRectangle() {
		rectangle++;
		
	}
	
	/**
	 * Return how often the classify method was called with parameter yielding a Irregular
	 */
	public int getIrregular() {
		return irregular;
	}

	/**
	 * Increment how often the classify method was called with parameter yielding a Irregular
	 */
	public void incrIrregular() {
		irregular++;
		
	}
	
	/**
	 * Return how often the classify method was called with parameter yielding a Irregular
	 */
	public int getParallelogram() {
		return parallelogram;
	}

	/**
	 * Increment how often the classify method was called with parameter yielding a Irregular
	 */
	public void incrParallelogram() {
		parallelogram++;
	}
	
	/**
	 * Return how often the classify method was called with parameter == 180
	 */
	public int getParam180() {
		return param180;
	};

	/**
	 * Increment how often the classify method was called with parameter == 180
	 */
	public void incrParam180() {
		param180++;
	}
	
	/**
	 * Increment how often the classify method was called with parameter > 360
	 */
	public void incrAngleHigh() {
		angleHigh++;
	}
	/**
	 * Increment how often the classify method was called with parameter > 360
	 */
	public int getAngleHigh() {
		return angleHigh;
	};

	/**
	 * Increment how often the classify method was called with parameter < 360
	 */
	public void incrAngleLow() {
		angleLow++;
	}
	/**
	 * Increment how often the classify method was called with parameter < 360
	 */
	public int getAngleLow() {
		return angleLow;
	};

}
