package edu.miamioh.acm.highscore;

public class Game {
	private int id;
	private String name;

	/**
	 * Construct a new Game object with the given id number and name.
	 *
	 * @param id The ID number for this Game
	 * @param name The name that should be given to this Game
	 */
	private Game(int id, String name) {
		this.name = name;
		this.id = id;
	}

	/**
	 * Search the Game database and if a Game with a matching name exists,
	 * return that Game, otherwise create it and save to the database.
	 *
	 * @param name The name to search for in the database
	 */
	public static Game getOrCreate(String name) {
		return new Game(0, name);
	}
}
