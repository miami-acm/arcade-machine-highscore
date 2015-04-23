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

	@Override
	public boolean equals(Object o) {
		if (o != null) {
			if (o instanceof Player) {
				Player p = (Player) o;
				return p.id == id;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("Player [id=%d name='%s']", id, name);
	}
	
	public String getName() {
		return name;
	}
}