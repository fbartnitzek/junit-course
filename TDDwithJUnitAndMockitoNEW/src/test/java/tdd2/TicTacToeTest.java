package tdd2;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TicTacToeTest {
	
	private TicTacToe ticTacToe = new TicTacToe();
	
	@Test
	public void testPiecePlacedOutsideXaxisThenRuntimeException() {
		catchException(ticTacToe).play(4, 2);
		assertTrue(caughtException() instanceof RuntimeException);
	}
	
	@Test
	public void testPiecePlacedOutsideYaxisThenRuntimeException() {
		catchException(ticTacToe).play(2, 4);
		assertTrue(caughtException() instanceof RuntimeException);
	}
	
	@Test
	public void testOccupiedSpaceShouldThrowRuntimeException() {
		ticTacToe.play(1, 1);
		catchException(ticTacToe).play(1, 1);
		assertTrue(caughtException() instanceof RuntimeException);
	}
	
	@Test
	public void testFirstTurnShouldBePlayedByX() {
		char nextPlayer = ticTacToe.getNextPlayer();
		assertEquals('X', nextPlayer);
	}
	
	@Test
	public void testIfLastTurnWasXThenNextTurnShouldBeO() {
		ticTacToe.play(1, 1);
		char nextPlayer = ticTacToe.getNextPlayer();
		assertEquals('O', nextPlayer);
	}

}
