package tdd2;

public class TicTacToe {

	public void play(int x, int y) {
		if (x>3 || x <1) {
			throw new RuntimeException("outside of the X-axis");
		}
		
	}

}
