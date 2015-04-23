import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.matchers.JUnitMatchers.hasItem;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import edu.miamioh.acm.highscore.HighScoreManager;
import edu.miamioh.acm.highscore.Player;

public class TestManager {
	HighScoreManager h;
	
	@Before
	public void setUp() {
		h = new HighScoreManager("Test Game", "test.db");
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testInsertGame() {
		Player p = h.getOrCreatePlayer(1);
		assertThat(h.getPlayers(), hasItem(p));
	}
}