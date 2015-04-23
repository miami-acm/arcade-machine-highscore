package edu.miamioh.acm.highscore;

public class HighScore {
	private int id;
	private int score;
	private Game game;
	private Player player;

	/**
	 * Construct a new HighScore object with the given ID number, score, related
	 * Player and related Game.
	 *
	 * @param id
	 *            The ID number for this HighScore object
	 * @param score
	 *            The numeric score for this HighScore object
	 * @param g
	 *            The Game object that this HighScore belongs to
	 * @param p
	 *            The Player object that this HighScore belongs to
	 */
	protected HighScore(int id, int score, Game g, Player p) {
		this.id = id;
		this.score = score;
		this.game = g;
		this.player = p;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o != null) {
			if (o instanceof HighScore) {
				HighScore h = (HighScore)o;
				return h.id == id;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("HighScore [player='%s' score=%d game='%s']", player.getName(), score, game.getName());
	}
}