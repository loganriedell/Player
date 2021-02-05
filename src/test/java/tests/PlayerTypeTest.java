package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Player;
import model.PlayerLogic;

public class PlayerTypeTest {
	PlayerLogic logic = new PlayerLogic();
	Player player = new Player("DoomSlayer");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void typeTest1() {
		player.setHourPlayedWeekly(3);
		assertEquals("Casual", logic.getPlayerType(player));
	}
	@Test
	public void typeTest2()
	{
		player.setHourPlayedWeekly(14);
		assertTrue("Dedicated" == logic.getPlayerType(player));
	}
	@Test
	public void typeTest3()
	{
		player.setHourPlayedWeekly(40);
		assertFalse("Very Serious" == logic.getPlayerType(player));
	}

}
