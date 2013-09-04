package com.burton_chandler.helpers;

public class Score {
	
	// Holds team information for a round.
	private int teamOneScore, teamTwoScore;
	private int teamOneMeld, teamTwoMeld;
	private int teamOneTrix, teamTwoTrix;	
	
	// Constructs a new score based on the current score
	public Score(int scoreOne, int scoreTwo){
		teamOneScore = scoreOne;
		teamTwoScore = scoreTwo;
	}
	
	// Sets the meld
	public void addMeld(int meldOne, int meldTwo){
		teamOneMeld = meldOne;
		teamTwoMeld = meldTwo;
	}
	
	// Sets the tricks
	public void addTrix(int trixOne, int trixTwo){
		teamOneTrix = trixOne;
		teamTwoTrix = trixTwo;
	}
	
	// Getters for all variables
	public int getScoreOne(){
		return teamOneScore;
	}
	public int getScoreTwo(){
		return teamTwoScore;
	}
	public int getMeldOne(){
		return teamOneMeld;
	}
	public int getMeldTwo(){
		return teamTwoMeld;
	}
	public int getTrixOne(){
		return teamOneTrix;
	}
	public int getTrixTwo(){
		return teamTwoTrix;
	}
}
