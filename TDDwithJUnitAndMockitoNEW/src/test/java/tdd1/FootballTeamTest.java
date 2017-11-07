package tdd1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FootballTeamTest {
	
	@Test
    public void testConstructorShouldSavesGamesWon() {
		// arrange, act
        FootballTeam team = new FootballTeam(3);
        
        // assert
        assertEquals(3, team.getGamesWon()); 
    }

}
