
public class Assignment6 {

	private static ResultStorageSingleton resultStorage;
	
	public Assignment6() {
		resultStorage = ResultStorageSingleton.getInstance();
	}

	public static int classify(int a, int b, int c) {
		int type;
		// Sort values to achieve that ((a <= b <= c))
		int help;
		if(c < a) { // Condition 1
			help = c;
			c = a;
			a = help;
		}
		if(c < b) { // Condition 2
			help = c;
			c = b;
			b = help;
		}
		if (b < a) { // Condition 3
			help = b;
			b = a;
			a = help;
		}
		
		if(a<0) {
			resultStorage.incrTC1();
		}
		if(a>=0 && b>=0 && c>=0) {
			if((c-a)>b) {
				resultStorage.incrTC2();
			}else {
				resultStorage.incrTC3();
			}
		}
		
		
		if ((a<0)|| (b<0) || (c<0) || ((c-a)>b)) { // Condition 4
			type = 0; // NO TRIANGLE, ILLEGAL VALUES
			resultStorage.incrLogicalReimining();
		}
		else {
			if ((a==0) || (b==0) || (c==0) || ((c-a)== b)) { // Condition 5
				type = 1; // NO TRIANGLE, BUT IN FACT A LINE
				resultStorage.incrLogicalReimining();
			}
			else {
				if((a==b) || (b==c)) { // Condition 6
					if (a==c) { // Condition 7
						type = 2; // EQUILATERAL TRIANGLE
						resultStorage.incrLogicalReimining();
					}
					else {
						type = 3; // ISOSCELES TRIANGLE
						resultStorage.incrLogicalReimining();
					}
				}
				else {
					type = 4; // SCALENE TRIANGLE
					resultStorage.incrLogicalReimining();
				}
			}
		}
		return type;
	}
	
}
