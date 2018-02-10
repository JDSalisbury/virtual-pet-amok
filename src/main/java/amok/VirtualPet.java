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

	public int getHappiness() {
		return happiness;
	}

	public void play() {
		int fun = 1;
		boredom -= fun;
		happiness += fun;
		health += fun;
	}

	public void tick() {
		int ticker = 1;
		health += ticker;

	}

}
