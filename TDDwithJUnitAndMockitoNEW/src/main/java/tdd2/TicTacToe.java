package tdd2;

public class TicTacToe {

	private static final int SIZE = 3;
	private char [][] board =  {{'\0', '\0', '\0'}, // 00, 01, 02
								{'\0', '\0', '\0'}, // 10, 11, 12
								{'\0', '\0', '\0'}};// 20, 21, 22
	private char lastPlayer = '\0';

	public char play(int x, int y) {
		checkAxis(x);
		checkAxis(y);
		if (board[x-1][y-1] != '\0') {
			throw new RuntimeException();
		}
		lastPlayer = getNextPlayer();
		board[x-1][y-1] = lastPlayer;
		return getWinner();
	}

	private char getWinner() {

		// horizontal check
		for (int i=0; i<SIZE; i++) {
			if (board[i][0] != '\0' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return board[i][0];
			}
		}
		
		// vertical check
		for (int i=0; i<SIZE; i++) {
			if (board[0][i] != '\0' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				return board[0][i];
			}
		}
		
		// diagonal check
		if (board[0][0] != '\0' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			return board[0][0];
		} else if (board[0][2] != '\0' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			return board[0][2];
		}		
		
		return '\0';
	}


	private void checkAxis(int x) {
		if (x > SIZE || x < 1) {
			throw new RuntimeException();
		}
	}

	public char getNextPlayer() {
		return this.lastPlayer == 'X' ? 'O' : 'X';
	}
}
