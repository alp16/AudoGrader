/**
 * Various classifications of a quadrilateral. This version of the class
 * contains all the code needed to assess JUnit code testing it. To this aim,
 * the singleton class ResultStorageSingleton is used to store there, whether
 * this class is called, e.g. with valid and invalid parameters, no defect
 * masking occurs, etc.
 * 
 * Students submitting such an assignment would however get a version that does
 * not does these checks, but returns always, e.g., QuadrilateralType.irregular
 * (So, students submitting cannot simply have a look at the source code and see
 * which checks are done.) A Gradescope shell script then would take care to
 * replace the dummy for the students with this class here. 
 */

enum QuadrilateralType {
	/**
	 * (alpha + beta + gamma + delta) == 360
	 */
	irregular,

	/**
	 * (alpha == gamma) && (beta == delta) && (alpha != delta)
	 */
	parallelogram,

	/**
	 * alpha == beta == gamma == delta == 90
	 */
	rectangle
}

/**
 * Everything related to a quadrilateral
 * 
 */

public class Quadrilateral {
	private ResultStorageSingleton resultStorage;

	public Quadrilateral() {
		resultStorage = ResultStorageSingleton.getInstance();
	}

	/**
	 * Classifies a quadrilateral based on its internal angels
	 * 
	 * @param alpha first angle
	 * @param beta  second angle
	 * @param gamma third angle
	 * @param delta fourth angle
	 * @return the classification
	 * @throws InvalidParameterException for invalid parameters
	 */

	public QuadrilateralType classify(int alpha, int beta, int gamma, int delta) throws InvalidParameterException {
		
		if (alpha == 0 || beta ==0 || gamma == 0 || delta == 0) {
			resultStorage.incrParamZero();
			throw new InvalidParameterException("Some parameter == 0");
		}
		if (alpha < 0 || beta < 0 || gamma < 0 || delta < 0) {
			resultStorage.incrParamLowerThanZero();
			throw new InvalidParameterException("Some parameter < 0");
		}
		
		if(alpha + beta + gamma + delta > 360) {
			resultStorage.incrAngleHigh();
			throw new InvalidParameterException("Angle > 360 degrees");
		}
		if(alpha + beta + gamma + delta < 360) {
			resultStorage.incrAngleLow();
			throw new InvalidParameterException("Angle < 360 degrees");
		}
		
		if(alpha == 180 || beta == 180 || gamma == 180 || delta == 180 ) {
			resultStorage.incrParam180();
			throw new InvalidParameterException("Some Parameter = 180 degrees");
		}

		if ((alpha == 90) && (beta == 90) && (gamma == 90) && (delta == 90)) {
			resultStorage.incrRectangle();
			return QuadrilateralType.rectangle;
		}
		if((alpha == beta && gamma == delta && alpha != delta)|| (alpha==delta && beta == gamma && alpha != beta) 
				|| (alpha==gamma && beta==delta&& alpha != beta)) {
			resultStorage.incrParallelogram();
			return QuadrilateralType.parallelogram;
		}
		
		resultStorage.incrIrregular();
		return QuadrilateralType.irregular;
	}
}
