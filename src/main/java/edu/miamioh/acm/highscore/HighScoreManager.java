package edu.miamioh.acm.highscore;

import java.util.ArrayList;

public class HighScoreManager {
	private Game game;
	private ArrayList<HighScore> scores;

	/**
	 * Construct a new HighScoreManager storing the scores for the given Game.
	 *
	 * @param g the Game object to store the scores for
	 */
	public HighScoreManager(Game g) {
		scores = new ArrayList<HighScore>();
	}

	/**
	 * Construct a new HighScore object and append it to the list of scores for
	 * the related Game.
	 *
	 * @param score The score that the player earned
	 * @param p the Player that scored the score
	 */
	public void newScore(int score, Player p) {

	}

	/**
	 * Get the list of scores for the game related to this HighScoreManager.
	 *
	 * @return List of HighScore objects belonging to this HighScoreManager
	 */
	public ArrayList<HighScore> getScores() {
		return scores;
	}
}
