package tdd2;

public class TicTacToe {

	private static final int SIZE = 3;

	public void play(int x, int y) {
		checkAxis(x);
		checkAxis(y);

	}

	private void checkAxis(int x) {
		if (x > SIZE || x < 1) {
			throw new RuntimeException();
		}
	}

}
