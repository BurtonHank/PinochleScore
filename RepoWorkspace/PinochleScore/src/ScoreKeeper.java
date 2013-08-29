/*
 * Handles score keeping.
 */
public class ScoreKeeper {
	// Score vars
	public int scoreOne, scoreTwo;
	public int meldOne, meldTwo;
	public int trixOne, trixTwo;
	private int bid;
	private boolean bidder; //True = scoreOne :: False = scoreTwo
	
	// two constructors
	public ScoreKeeper(){
		scoreOne = 0;
		scoreTwo = 0;
	}
	public ScoreKeeper(int one, int two){
		scoreOne = one;
		scoreTwo = two;
	}
	
	// Reset the score
	public void reset(){
		scoreOne = 0;
		scoreTwo = 0;
	}
	
	// Set score
	public void setScore(int one, int two){
		scoreOne = one;
		scoreTwo = two;
	}
	
	// Set bid
	public void setBid(int bidAmnt, boolean team){
		bid = bidAmnt;
		bidder = team;
	}
	
	// Set the meld points
	public void setMeld(int one, int two){
		meldOne = one;
		meldTwo = two;
	}
	
	// Set the trix points
	public void setTrix(int one, int two){
		trixOne = one;
		trixTwo = two;
	}
	
	// End the round and check the score
	public void endRound()
	{
		if(bidder){
			if(meldOne + trixOne < bid){ // SET
				scoreOne -= bid;
			}
			else{
				scoreOne += meldOne + trixOne;
			}
			scoreTwo += meldTwo + trixTwo;
		}
		else{
			if(meldTwo + trixTwo < bid){
				scoreTwo -= bid;
			}
			else{
				scoreTwo += meldTwo + trixTwo;
			}
			scoreOne += meldOne + trixOne;
		}
	}
	
	// Early set
}
