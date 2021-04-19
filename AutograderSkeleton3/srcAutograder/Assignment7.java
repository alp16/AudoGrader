
public class Assignment7 {
	private ResultStorageSingleton resultStorage;
	
	public Assignment7() {
		resultStorage = ResultStorageSingleton.getInstance();
	}


	public int checkFee(int color, int dist ) {
		int fee=0;
		if(dist<0) {
			resultStorage.incrDist();
			if(dist==-1) {
				resultStorage.incrDistBorder();
			}
			throw new InvalidParameterException("dist<0");
		}
		if(color<0) {
			resultStorage.incrColorLow();
			if(color==-1) {
				resultStorage.incrColorBorderLow();
			}
			throw new InvalidParameterException("Color value under 0");
		}
		if(color>2) {
			resultStorage.incrColorHigh();
			if(color==3) {
				resultStorage.incrColorBorderHigh();
			}
			throw new InvalidParameterException("Color value over 2");
		}
		
		if(color == 0) {
			if(dist <= 15) {
				resultStorage.incrFee16300();
				if(dist ==15 || dist==0) {
					resultStorage.incrDistBorderUnder();
				}
				fee = 16300;
			}else {
				resultStorage.incrFee21100();
				if(dist==16) {
					resultStorage.incrDistBorderOver();
				}
				fee = 21100;
			}
		}
		if(color == 1) {
			if(dist <= 15) {
				resultStorage.incrFee8150();
				if(dist ==15 || dist==0) {
					resultStorage.incrDistBorderUnder();
				}
				fee = 8150;
			}else {
				resultStorage.incrFee12950();
				if(dist==16) {
					resultStorage.incrDistBorderOver();
				}
				fee = 12950;
			}
		}
		if(color == 2) {
			if(dist <= 15) {
				resultStorage.incrFee7400();
				if(dist ==15 || dist==0) {
					resultStorage.incrDistBorderUnder();
				}
				fee = 7400;
			}else {
				resultStorage.incrFee12200();
				if(dist==16) {
					resultStorage.incrDistBorderOver();
				}
				fee = 12200;
			}
		}
		return fee;
	}
}
