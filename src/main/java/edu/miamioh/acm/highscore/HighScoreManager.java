package edu.miamioh.acm.highscore;

import java.util.ArrayList;

public class HighScoreManager {
	private Game game;
	private ArrayList<HighScore> scores;

	/**
	 * Construct a new HighScoreManager storing the scores for the given Game.
	 *
	 * @param g
	 *            the Game object to store the scores for
	 */
	public HighScoreManager(Game g) {
		game = g;
		scores = new ArrayList<HighScore>();
	}

	/**
	 * Construct a new HighScoreManager storing the scores for the Game with the
	 * given name.
	 *
	 * @param name
	 *            the name of the game to lookup in the database
	 */
	public HighScoreManager(String name) {
		game = getOrCreateGame(name);
		scores = new ArrayList<HighScore>();
	}

	/**
	 * Construct a new HighScore object and append it to the list of scores for
	 * the related Game.
	 *
	 * @param score
	 *            The score that the player earned
	 * @param p
	 *            the Player that scored the score
	 */
	public void newScore(int score, Player p) {
		HighScore s = new HighScore(1, score, game, p);
		scores.add(s);
	}

	/**
	 * Find the player with the given ID, or create it if it doesn't exist.
	 *
	 * @param id
	 *            The ID number of the Player
	 */
	public Player getOrCreatePlayer(int id) {
		return new Player(id, "Nate");
	}

	/**
	 * Search the Game database and if a Game with a matching name exists,
	 * return that Game, otherwise create it and save to the database.
	 *
	 * @param name
	 *            The name to search for in the database
	 */
	public Game getOrCreateGame(String name) {
		return new Game(0, name);
	}

	/**
	 * Return the list of {@link HighScore}s associated with the {@link Game}
	 * related to this {@link HighScoreManager}.
	 * 
	 * @return list of {@link HighScore}s
	 */
	public ArrayList<HighScore> getHighScores() {
		return scores;
	}
}