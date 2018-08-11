package simple_rock_paper_scissors_game;

public class RandomPlayer extends Player {

	public RandomPlayer() {
		super("Undefined", "Undefined");
	}

	public RandomPlayer(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	@Override
	public Token getState() {
		return  Token.values()[(int)(Math.random() * 3 )];
	}

	@Override
	public String toString() {
		return super.toString();
	}
	

}
