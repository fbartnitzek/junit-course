package tdd1;

public class FootballTeam {
	private int gamesWon;

	public FootballTeam(int gamesWon) {
		if (gamesWon<0) {
			throw new IllegalArgumentException("must not be negative");
		}
		this.gamesWon = gamesWon;
	}

	public int getGamesWon() {
		return gamesWon;
	}

}
