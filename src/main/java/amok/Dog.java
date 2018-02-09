package amok;

public class Dog extends Organic {

	public Dog(String name, String description, int health, int food, int drink, int boredom, int potty) {
		this.food = food;
		this.drink = drink;
		this.health = health;
		this.boredom = boredom;
		this.name = name;
		this.potty = potty;
		this.description = description;
	}

	public Dog(String name, String description) {
		this.name = name;
		this.description = description;
	}

}
