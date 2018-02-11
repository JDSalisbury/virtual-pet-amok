package amok;

public abstract class VirtualPet {
	protected String name;
	protected String description;
	protected int health;
	protected int boredom;
	protected int happiness;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public int getBoredom() {
		return boredom;
	}

	public String getHappiness() {
		if (happiness <= 0 || health <= 0) {
			return "wants to die";
		}

		if (happiness <= 3 || health <= 3) {
			return "feels alive but isnt thrilled about it";
		}

		if (happiness <= 6 || health <= 6) {
			return "three meals and a place to sleep, cant complain i guess";
		}

		if (happiness <= 9 || health <= 9)
			return " its a great day to be in a Virtual Shelter!";

		return "I want to live in the Shelter forever!";
	}

	public void play() {
		int fun = 1;
		boredom -= 3;
		happiness += fun;
		health += fun;

	}

	public void tick() {
		int ticker = 1;
		health -= ticker;
		boredom += ticker;
		happiness -= ticker;

	}

}
