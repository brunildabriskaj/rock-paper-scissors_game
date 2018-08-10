package simple_rock_paper_scissors_game;

public class Game {
	private Player firstPlayer;
	private Player secondPlayer;
	private int rounds = -1;

	private int firstPlayerWins = 0;
	private int secondPlayerWins = 0;

	public Game(Player firstPlayer, Player secondPlayer, int rounds) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
		this.rounds = rounds;
	}

	public Result playGame() {

		System.out.println("First Player Token\tSecond Player Token\tWinner" );
		while (rounds-- > 0) {
			Token firstPlayerToken = firstPlayer.getState();
			Token secondPlayerToken = secondPlayer.getState();
			int roundWinner = getRoundWinner(firstPlayerToken, secondPlayerToken);
			if (roundWinner == 1) {
				firstPlayerWins++;
				System.out.println(firstPlayerToken + "\t\t\t" + secondPlayerToken +  "\t\t\t" + firstPlayer.getFirstName() + " " + firstPlayer.getLastName() );
			} else if (roundWinner == 2) {
				secondPlayerWins++;
				System.out.println(firstPlayerToken + "\t\t\t" + secondPlayerToken +  "\t\t\t" + secondPlayer.getFirstName() + " " + secondPlayer.getLastName());
			}
			else {
				System.out.println(firstPlayerToken + "\t\t\t" + secondPlayerToken +  "\t\t\tNo winner");
			}

		}

		return new Result(firstPlayer, firstPlayerWins, secondPlayer, secondPlayerWins);
	}

	private int getRoundWinner(Token firstPlayerToken, Token secondPlayerToken) {

		if (firstPlayerToken == Token.ROCK) {
			if (secondPlayerToken == Token.PAPER) {
				return 2;

			} else if (secondPlayerToken == Token.SCISSOR) {
				return 1; 
			}
		} else if (firstPlayerToken == Token.PAPER) {
			if (secondPlayerToken == Token.ROCK) {
				return 1;
			} else if (secondPlayerToken == Token.SCISSOR) {
				return 2;
			}
		} else if (firstPlayerToken == Token.SCISSOR) {
			if (secondPlayerToken == Token.ROCK) {
				return 2;
			} else if (secondPlayerToken == Token.PAPER) {
				return 1;
			}
		}
		return 0;
	}
}