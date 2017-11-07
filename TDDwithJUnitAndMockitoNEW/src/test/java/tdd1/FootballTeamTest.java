package tdd1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FootballTeamTest {
	private static final int GAMES_WON = 3;
	
	
	@Test
    public void testConstructorShouldSavesGamesWon() {
		// arrange, act
        FootballTeam team = new FootballTeam(GAMES_WON);
        
        // assert
        assertEquals(GAMES_WON + " was expected but the constructor returned " + team.getGamesWon(),
        		GAMES_WON, team.getGamesWon()); 
    }
	
	@Test(expected=IllegalArgumentException.class)
	@Parameters(method="getNegativeGamesWon")
    public void testConstructorShouldThrowIAEforNegativeValue(int gamesWon) {
		// arrange, act
        FootballTeam team = new FootballTeam(gamesWon);
        
        // assert (s. @Test(expected...)
    }
	
	private static Object[] getNegativeGamesWon() {
		return new Object[]{-1, -12,- 3871};
	}
	
	@Test
	public void testIsComparable() {
		FootballTeam team = new FootballTeam(GAMES_WON);
		
		assertTrue("does not implement Comparable", team instanceof Comparable);
	}

}
