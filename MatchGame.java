//LaDarion Wells
public class MatchGame {

	private int[] bins = new int[5];
	
	//assigns each bin to 7
	public MatchGame() {
		for(int i =0; i < bins.length; ++i) {
			bins[i] =7;
		}
	}
	
	//method that will remove matches iff there are matches and iff those matches
	// are in the bins (binNum) range
	public boolean removeMatches(int matches, int binNum) {
		if(matches <=0) {
			return false;
		}
		if(binNum <0 || binNum >= bins.length) {
			return false;
		}
		if(matches > bins[binNum]) {
			return false;
		}
		bins[binNum] = bins[binNum] - matches;
		return true;
	}
	

	public boolean checkGameEnd() {
		for(int i=0; i< bins.length; ++i) {
			if(bins[i]>0) {
				return false;
			}

		}
		
		return true;
		
	}

	public String toString() {
		String gameBin = "";
		for(int i=0; i<bins.length;++i) {
			gameBin = gameBin + " " + bins[i] + " ";
		}
		return gameBin;
		
			
		
	}

	

}

