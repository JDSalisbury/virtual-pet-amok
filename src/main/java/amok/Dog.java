package amok;

public class Dog extends Organic implements Walkable {

	public Dog(String name, String description, int health, int food, int drink, int boredom, int potty,
			int happiness) {
		this.food = food;
		this.drink = drink;
		this.health = health;
		this.boredom = boredom;
		this.name = name;
		this.potty = potty;
		this.description = description;
		this.happiness = happiness;
	}

	public Dog(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void goOnWalk() {
		int walking = 1;
		boredom -= walking;
		health += walking;
		potty -= walking;
		happiness += walking;
	}

	@Override
	public String toString() {
		return "" + name + "\t\t|" + health + "\t|" + happiness + "\t\t|" + food + "\t|" + drink + "\t|" + boredom
				+ "\t|" + potty + "\t\t-" + description;
	}

	@Override
	public void tick() {
		super.tick();
		int ticks = 1;
		food -= ticks;
		drink -= ticks;
		potty += ticks;
	}

}
