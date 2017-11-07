package tdd2;

public class TicTacToe {

	private static final int SIZE = 3;
	private char [][] board =  {{'\0', '\0', '\0'}, // 00, 01, 02
								{'\0', '\0', '\0'}, // 10, 11, 12
								{'\0', '\0', '\0'}};// 20, 21, 22

	public void play(int x, int y) {
		checkAxis(x);
		checkAxis(y);
		if (board[x-1][x-y] != '\0') {
			throw new RuntimeException();
		}
		board[x-1][y-1] = 'X';
	}

	private void checkAxis(int x) {
		if (x > SIZE || x < 1) {
			throw new RuntimeException();
		}
	}

}
