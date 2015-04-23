package edu.miamioh.acm.highscore;

public class Player {
	private int id;
	private String name;

	/**
	 * Construct a new Player object with the given id and name.
	 *
	 * @param id The ID number to be given to this Player
	 * @param name The name to be given to this Player
	 */
	private Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Search the Player database and if a Player with a matching name exists,
	 * return that Player, otherwise create it and save to the database.
	 *
	 * @param name The name to search for in the database
	 */
	public static Player getOrCreate(int id) {
		return new Player(0, "Nate");
	}
}
