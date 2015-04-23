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
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			if (o instanceof Game) {
				Game g = (Game)o;
				return g.id == id;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("Game [id=%d name='%s']", id, name);
	}
	
}