package simple_rock_paper_scissors_game;

public abstract class Player {
	public final static int ROCK = 1, PAPER = 2, SCISSORS = 3;
	private String firstName;
	private String lastName;
	private int state;

	public Player() {
		this("Undefined", "Undefined");
	}

	public Player(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public abstract int getState();

	public void setState(int state) {
		this.state = state;
	}

	public static int getRock() {
		return ROCK;
	}

	public static int getPaper() {
		return PAPER;
	}

	public static int getScissors() {
		return SCISSORS;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
