package edu.miamioh.acm.highscore;

public class Player {
	private int id;
	private String name;

	/**
	 * Construct a new Player object with the given id and name.
	 *
	 * @param id
	 *            The ID number to be given to this Player
	 * @param name
	 *            The name to be given to this Player
	 */
	protected Player(int id, String name) {
		this.id = id;
		this.name = name;
	}
}