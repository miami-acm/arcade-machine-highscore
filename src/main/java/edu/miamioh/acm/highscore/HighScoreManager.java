package edu.miamioh.acm.highscore;

import java.util.ArrayList;
import java.sql.*;

public class HighScoreManager {
	private static final String DEFAULT_DB_NAME = "games.db";
	
	private Game game;
	private ArrayList<HighScore> scores;
	private ArrayList<Player> players;
	private Connection connection;

	/**
	 * Construct a new HighScoreManager storing the scores for the given Game.
	 *
	 * @param g
	 *            the Game object to store the scores for
	 */
	public HighScoreManager(Game g) {
		this(g, DEFAULT_DB_NAME);
	}
	
	public HighScoreManager(Game g, String dbName) {
		initialize(g, dbName);
	}

	private void initialize(Game g, String dbName) {
		game = g;
		scores = new ArrayList<HighScore>();
		players = new ArrayList<Player>();

		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:" + dbName);
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}

	/**
	 * Construct a new HighScoreManager storing the scores for the Game with the
	 * given name.
	 *
	 * @param name
	 *            the name of the game to lookup in the database
	 */
	public HighScoreManager(String gameName) {
		this(gameName, DEFAULT_DB_NAME);
	}
	
	public HighScoreManager(String gameName, String dbName) {
		initialize(getOrCreateGame(gameName), dbName);
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
		Player p = new Player(id, "Nate");
		players.add(p);
		return p;
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
	
	public ArrayList<Player> getPlayers() {
		return players;
	}
}