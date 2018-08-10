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
		String firstNameofFirstPlayer = getInfo();
		System.out.println("Please, enter your last name: ");
		String lastNameofFirstPlayer = getInfo();
		return new RockPlayer(firstNameofFirstPlayer, lastNameofFirstPlayer);
	}

	public static Player getRandomPlayer() {

		System.out.println("Please, enter your first name: ");
		String firstNameofSecondPlayer = getInfo();
		System.out.println("Please, enter your last name: ");
		String lastNameofSecondPlayer = getInfo();
		return new RandomPlayer(firstNameofSecondPlayer, lastNameofSecondPlayer);
	}

	public static void findWinner(int pointOfFirstPlayer, int pointOfSecondPlayer, Player firstPlayer,
			Player secondPlayer) {
		if (pointOfFirstPlayer > pointOfSecondPlayer) {
			System.out.println("The winner is the first player:  " + firstPlayer + "!");
		} else if (pointOfFirstPlayer < pointOfSecondPlayer) {
			System.out.println("The winner is the second player: " + secondPlayer + "!");
		} else {
			System.out.println("There is no winner!");
		}
	}

	public static void main(String[] args) {

		int pointOfFirstPlayer = 0, pointOfSecondPlayer = 0;
		int stateOfFirstPlayer = Player.ROCK, stateOfSecondPlayer;

		System.out.println("First Player ");
		Player firstPlayer = getRockPlayer();

		System.out.println(".........................................");
		System.out.println("\nSecond Player ");

		Player secondPlayer = getRandomPlayer();

		System.out.println(".........................................");
		System.out.println("\t\t\tResults during rounds\n");
		System.out.println("\t\tFirst Player " + "\t" + "Second Player \t Winner");
		for (int i = 0; i < 4; i++) {
			Player winner = null;

			stateOfFirstPlayer = firstPlayer.getState();
			stateOfSecondPlayer = secondPlayer.getState();
			String state;
			if (stateOfSecondPlayer == Player.ROCK) {
				state = "ROCK";
			} else if (stateOfSecondPlayer == Player.PAPER) {
				state = "PAPER";
			} else {
				state = "SCISSORS";

			}

			if (stateOfSecondPlayer == Player.PAPER) {
				pointOfSecondPlayer++;
				winner = secondPlayer;
			} else if (stateOfSecondPlayer == Player.SCISSORS) {
				pointOfFirstPlayer++;
				winner = firstPlayer;
			}
			if (winner == null) {
				System.out.println("\t\tROCK" + "\t\t" + String.format("%8s", state) + "\t No winner");
			} else {
				System.out.println("\t\tROCK" + "\t\t" + String.format("%8s", state) + "\t " + winner.getFirstName()
						+ " " + winner.getLastName());
			}
		}

		System.out.println();
		findWinner(pointOfFirstPlayer, pointOfSecondPlayer, firstPlayer, secondPlayer);

	}

}
