package edu.miamioh.acm.highscore;

public class Game {
	private int id;
	private String name;

	/**
	 * Construct a new Game object with the given id number and name.
	 *
	 * @param id
	 *            The ID number for this Game
	 * @param name
	 *            The name that should be given to this Game
	 */
	protected Game(int id, String name) {
		this.name = name;
		this.id = id;
	}
}