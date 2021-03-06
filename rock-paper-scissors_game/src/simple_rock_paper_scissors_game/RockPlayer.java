package simple_rock_paper_scissors_game;

public class RockPlayer extends Player {

	public RockPlayer() {
		super("Undefined", "Undefined");
	}

	public RockPlayer(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public Token getState() {
		return Token.ROCK;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
