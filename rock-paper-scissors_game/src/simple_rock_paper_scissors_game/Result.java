package simple_rock_paper_scissors_game;

public class Result {
	private Player firstPlayer;
	private int firstPlayerRoundWins;
	private Player secondPlayer;
	private int secondPlayerRoundWins;

	public Result(Player firstPlayer, int firstPlayerRoundWins, Player secondPlayer, int secondPlayerRoundWins) {
		this.firstPlayer = firstPlayer;
		this.firstPlayerRoundWins = firstPlayerRoundWins;
		this.secondPlayer = secondPlayer;
		this.secondPlayerRoundWins = secondPlayerRoundWins;
	}
	
	public Player getFirstPlayer() {
		return firstPlayer;
	}

	public void setFirstPlayer(Player firstPlayer) {
		this.firstPlayer = firstPlayer;
	}

	public int getFirstPlayerRoundWins() {
		return firstPlayerRoundWins;
	}

	public void setFirstPlayerRoundWins(int firstPlayerRoundWins) {
		this.firstPlayerRoundWins = firstPlayerRoundWins;
	}

	public Player getSecondPlayer() {
		return secondPlayer;
	}

	public void setSecondPlayer(Player secondPlayer) {
		this.secondPlayer = secondPlayer;
	}

	public int getSecondPlayerRoundWins() {
		return secondPlayerRoundWins;
	}

	public void setSecondPlayerRoundWins(int secondPlayerRoundWins) {
		this.secondPlayerRoundWins = secondPlayerRoundWins;
	}

	@Override
	public String toString() {
		return "Result{" + "firstPlayer=" + firstPlayer + ", firstPlayerRoundWins=" + firstPlayerRoundWins
				+ ", secondPlayer=" + secondPlayer + ", secondPlayerRoundWins=" + secondPlayerRoundWins + '}';
	}
}