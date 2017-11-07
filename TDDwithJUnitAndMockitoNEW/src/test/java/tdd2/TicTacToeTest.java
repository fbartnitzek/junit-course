package tdd2;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TicTacToeTest {
	
	@Test
	public void testPiecePlacedOutsideXaxisThenRuntimeException() {
		TicTacToe ticTacToe = new TicTacToe();
		catchException(ticTacToe).play(4, 2);
		assertTrue(caughtException() instanceof RuntimeException);
	}

}
