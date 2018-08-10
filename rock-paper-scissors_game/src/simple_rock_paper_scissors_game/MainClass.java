package simple_rock_paper_scissors_game;

import java.util.Scanner;

public class MainClass {
	static Scanner input = new Scanner(System.in);

	public static String getInfo() {
		String info = input.nextLine();
		do {
			int i;
			for (i = 0; i < info.length(); i++) {
				if (!Character.isLetter(info.charAt(i))) {
					break;
				}
			}
			if (i == info.length()) {
				break;
			}
			System.out.println("Wrong input. Try again");
			info = input.nextLine();
		} while (true);
		return info;
	}

	public static Player getRockPlayer() {

		System.out.println("Please, enter your first name: ");
		String firstName = getInfo();
		System.out.println("Please, enter your last name: ");
		String lastName = getInfo();
		return new RockPlayer(firstName, lastName);
	}

	public static Player getRandomPlayer() {

		System.out.println("Please, enter your first name: ");
		String firstName = getInfo();
		System.out.println("Please, enter your last name: ");
		String lastName = getInfo();
		return new RandomPlayer(firstName, lastName);
	}

	private static Player getHumanPlayer() {
		System.out.println("Please, enter your first name: ");
		String firstName = getInfo();
		System.out.println("Please, enter your last name: ");
		String lastName = getInfo();
		return new HumanPlayer(firstName, lastName);
	}


	public static void findWinner(Result result) {
		if (result.getFirstPlayerRoundWins() > result.getSecondPlayerRoundWins()) {
			System.out.println("The winner is the first player: " + result.getFirstPlayer());
		} else if (result.getFirstPlayerRoundWins() < result.getSecondPlayerRoundWins()) {
			System.out.println("The winner is the second player: " + result.getSecondPlayer());
		} else {
			System.out.println("There is no winner");
		}
	}

	public static void main(String[] args) {
		System.out.println("The first game");
		Game firstGame = setUpFirstGame();
		Result firstGameResult = firstGame.playGame();
		findWinner(firstGameResult);
		System.out.println("............................................................\n\n");
		System.out.println("The second game");
		Game secondGame = setUpSecondGame();
		Result secondGameResult = secondGame.playGame();
		findWinner(secondGameResult);

	}

	
	private static Game setUpFirstGame() {
		System.out.println("First Player");
		Player firstPlayer = getRockPlayer();
		System.out.println("Second Player");
		Player secondPlayer = getRandomPlayer();
		System.out.println("............................................................");
		int rounds = 100;
		return new Game(firstPlayer, secondPlayer, rounds);
	}

	
	private static Game setUpSecondGame() {
		System.out.println("First Player");
		Player firstPlayer = getRandomPlayer();
		System.out.println("Second Player");
		Player secondPlayer = getHumanPlayer();
		System.out.println("............................................................");
		int rounds = 5;

		return new Game(firstPlayer, secondPlayer, rounds);
	}

}