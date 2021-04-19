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

	private int fee16300;
	private int fee21100;
	private int fee8150;
	private int fee12950;
	private int fee7400;
	private int fee12200;
	private int colorHigh;
	private int colorLow;
	private int dist;
	private int colorBorderHigh;
	private int colorBorderLow;
	private int distBorder;
	
	private int distBorderUnder;
	private int distBorderOver;

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
	public int getFee16300() {
		return fee16300;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrFee16300() {
		fee16300++;
	}


	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getFee21100() {
		return fee21100;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrFee21100() {
		fee21100++;
	}
	
	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getFee8150() {
		return fee8150;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrFee8150() {
		fee8150++;
	}
	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getFee12950() {
		return fee12950;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrFee12950() {
		fee12950++;
	}
	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getFee7400() {
		return fee7400;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrFee7400() {
		fee7400++;
	}
	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getFee12200() {
		return fee12200;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrFee12200() {
		fee12200++;
	}
	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getColorHigh() {
		return colorHigh;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrColorHigh() {
		colorHigh++;
	}
	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getcColorBorderLow() {
		return colorBorderLow;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrColorBorderLow() {
		colorBorderLow++;
	}
	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getColorBorderHigh() {
		return colorBorderHigh;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrColorBorderHigh() {
		colorBorderHigh++;
	}
	/**
	 * Return how often the checkFee method was called with color < 0
	 */
	public int getColorLow() {
		return colorLow;
	}

	/**
	 * Increment how often the checkFee method was called with color < 0
	 */
	public void incrColorLow() {
		colorLow++;
	}
	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getDist() {
		return dist;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrDist() {
		dist++;
	}
	
	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getDistBorder() {
		return distBorder;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrDistBorder() {
		distBorder++;
	}
	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getDistBorderUnder() {
		return distBorderUnder;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrDistBorderUnder() {
		distBorderUnder++;
	}
	/**
	 * Return how often the classify method was called with some parameter == 0
	 */
	public int getDistBorderOver() {
		return distBorderOver;
	}

	/**
	 * Increment how often the classify method was called with some parameter == 0
	 */
	public void incrDistBorderOver() {
		distBorderOver++;
	}
}
