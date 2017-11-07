package tdd2;

public class TicTacToe {
	
	public static final char X = 'X';
	public static final char N = '\0';
	public static final char O = 'O';
	public static final char D = 'D';

	private static final int SIZE = 3;
	private char [][] board =  {{N, N, N}, // 00, 01, 02
								{N, N, N}, // 10, 11, 12
								{N, N, N}};// 20, 21, 22
	private char lastPlayer = N;

	public char play(int x, int y) {
		checkAxis(x);
		checkAxis(y);
		if (board[x-1][y-1] != N) {
			throw new RuntimeException();
		}
		lastPlayer = getNextPlayer();
		board[x-1][y-1] = lastPlayer;
		return getWinner();
	}

	private char getWinner() {

		// horizontal check
		for (int i=0; i<SIZE; i++) {
			if (board[i][0] != N && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return board[i][0];
			}
		}
		
		// vertical check
		for (int i=0; i<SIZE; i++) {
			if (board[0][i] != N && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				return board[0][i];
			}
		}
		
		// diagonal check
		if (board[0][0] != N && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			return board[0][0];
		} else if (board[0][2] != N && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			return board[0][2];
		}
		
		if (allFilled()) {
			return D;
		}
		
		
		return N;
	}
	
	private boolean allFilled() {
		boolean emptyExists = false;

		for (int i=0; i<SIZE; i++) {
			for (int j=0; j<SIZE; j++) {
				emptyExists |= board[i][j] == N; 
			}
		}
		return !emptyExists;
	}


	private void checkAxis(int x) {
		if (x > SIZE || x < 1) {
			throw new RuntimeException();
		}
	}

	public char getNextPlayer() {
		return this.lastPlayer == X ? O : X;
	}
}
