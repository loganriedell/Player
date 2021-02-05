package tests;
import model.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SkillLevelTest {
	PlayerLogic logic = new PlayerLogic();
	Player player = new Player("DoomSlayer");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void skillTest() {
		player.increaseSkillPoints(900);
		assertEquals("Low", logic.getPlayerSkillLevel(player));
	}
	@Test
	public void skillTest2()
	{
		player.increaseSkillPoints(1500);
		assertTrue(logic.getPlayerSkillLevel(player) == "Moderate");
	}
	@Test
	public void skillTest3()
	{
		player.increaseSkillPoints(2500);
		assertFalse(logic.getPlayerSkillLevel(player) == "Low");
	}
	@Test 
	public void skillTest4()
	{
		player.increaseSkillPoints(4000);
		assertNotNull(logic.getPlayerSkillLevel(player));
	}
}
