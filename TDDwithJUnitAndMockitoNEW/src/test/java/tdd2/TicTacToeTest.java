package tdd2;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static tdd2.TicTacToe.X;
import static tdd2.TicTacToe.N;
import static tdd2.TicTacToe.O;
import static tdd2.TicTacToe.D;

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
		assertEquals(X, nextPlayer);
	}
	
	@Test
	public void testIfLastTurnWasXThenNextTurnShouldBeO() {
		ticTacToe.play(1, 1);
		char nextPlayer = ticTacToe.getNextPlayer();
		assertEquals(O, nextPlayer);
	}
	
	// adds nothing new, already fulfilled by previous method
//	@Test
//	public void testIfLastTurnWasOThenNextTurnShouldBeX() {
//		ticTacToe.play(1, 1);
//		ticTacToe.play(2, 2);
//		char nextPlayer = ticTacToe.getNextPlayer();
//		assertEquals('X', nextPlayer);
//	}
	
	@Test
	public void testIfNoWinningConditionIsFulfilledThenNoWinner() {
		char winner = ticTacToe.play(1, 1);
		assertEquals(N, winner);
	}
	
	@Test
	public void testHorizontalLinesForWinner() {
		assertEquals(N, ticTacToe.play(1, 1));	// X
		assertEquals(N, ticTacToe.play(2, 2));	// O
		assertEquals(N, ticTacToe.play(1, 2));	// X
		assertEquals(N, ticTacToe.play(2, 3));	// O
		assertEquals(X, ticTacToe.play(1, 3));	// X wins with x=1
	}
	
	@Test
	public void testVerticalLinesForWinner() {
		assertEquals(N, ticTacToe.play(1, 1));	// X
		assertEquals(N, ticTacToe.play(2, 2));	// O
		assertEquals(N, ticTacToe.play(2, 1));	// X
		assertEquals(N, ticTacToe.play(3, 2));	// O
		assertEquals(X, ticTacToe.play(3, 1));	// X wins with y=1
	}
	
	@Test
	public void testDiagonalLinesForWinner() {
		assertEquals(N, ticTacToe.play(2, 1));	// X
		assertEquals(N, ticTacToe.play(1, 1));	// O
		assertEquals(N, ticTacToe.play(2, 3));	// X
		assertEquals(N, ticTacToe.play(2, 2));	// O
		assertEquals(N, ticTacToe.play(1, 2));	// X
		assertEquals(O, ticTacToe.play(3, 3));	// O wins with [ii]
	}
	
	@Test
	public void testDrawForNoWinner() {
		assertEquals(N, ticTacToe.play(1, 2));	// X
		assertEquals(N, ticTacToe.play(1, 1));	// O
		assertEquals(N, ticTacToe.play(2, 1));	// X
		assertEquals(N, ticTacToe.play(1, 3));	// O
		assertEquals(N, ticTacToe.play(2, 3));	// X
		assertEquals(N, ticTacToe.play(2, 2));	// O
		assertEquals(N, ticTacToe.play(3, 1));	// X
		assertEquals(N, ticTacToe.play(3, 2));	// O
		assertEquals(D, ticTacToe.play(3, 3));	// X wins with [ii]
	}
	
	

}
