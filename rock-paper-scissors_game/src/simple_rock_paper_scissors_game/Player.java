package simple_rock_paper_scissors_game;

public abstract class Player {
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

	public abstract Token getState();

	public void setState(int state) {
		this.state = state;
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
