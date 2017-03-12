import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.Random;
import org.junit.Test;

public class dominionTest
{
	@Test
	public void testDominionConstructor()
	{
		Dominion testGame = new Dominion(100);
		assertNotNull(testGame.playerCount);
		assertEquals(7, testGame.basicCards.size());
		assertEquals(10, testGame.kingdomCards.size());
	}
}

