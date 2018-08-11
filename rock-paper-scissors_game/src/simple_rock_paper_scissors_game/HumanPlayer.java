package simple_rock_paper_scissors_game;

import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer() {
		super("Undefined", "Undefined");
	}

	public HumanPlayer(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public Token getState() { 
		System.out.println("Determine the state you are going to play in this round(ROCK, PAPER or SCISSOR): ");
		String state = MainClass.input.nextLine();
		while (!state.equalsIgnoreCase("ROCK") && !state.equalsIgnoreCase("PAPER")
				&& !state.equalsIgnoreCase("SCISSOR")) {
			System.out.println("Wrong input! Try again! Determine the state you are going to play in this round(ROCK, PAPER or SCISSOR):");
			state = MainClass.input.nextLine();
		} 
		if (state.equalsIgnoreCase("ROCK")) {
			return Token.ROCK;

		}
		if (state.equalsIgnoreCase("PAPER")) {
			return Token.PAPER;

		}
		return Token.SCISSOR;
	}
}