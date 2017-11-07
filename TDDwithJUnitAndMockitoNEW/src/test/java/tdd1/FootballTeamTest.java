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
	
	@Test
	public void teamWithMoreMatchesWonShouldBeGreater() {
		FootballTeam team_3gamesWon = new FootballTeam(3);
		FootballTeam team_2gamesWon = new FootballTeam(2);
		
		assertTrue("team with 3 games won should be greater than team with 2 games won",
				team_3gamesWon.compareTo(team_2gamesWon) > 0);
	}
	
	@Test
	public void teamWithLessMatchesWonShouldBeLess() {
		FootballTeam team_3gamesWon = new FootballTeam(3);
		FootballTeam team_2gamesWon = new FootballTeam(2);
		
		assertTrue("team with 2 games won should be smaller than team with 2 games won",
				team_2gamesWon.compareTo(team_3gamesWon) < 0);
	}
	
	@Test
	public void teamsWithSameMatchesWonShouldBeEqual() {
		FootballTeam team_3gamesWon = new FootballTeam(3);
		FootballTeam team2_3gamesWon = new FootballTeam(3);
		
		assertTrue("both teams with 3 games won should be equal",
				team_3gamesWon.compareTo(team2_3gamesWon) == 0);
	}

}
