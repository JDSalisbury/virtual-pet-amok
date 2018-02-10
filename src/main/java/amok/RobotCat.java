package amok;

public class RobotCat extends Robot {

	public RobotCat(String name, String description, int oil, int health, int boredom, int happiness) {
		this.oil = oil;
		this.name = name;
		this.description = description;
		this.health = health;
		this.boredom = boredom;
		this.happiness = happiness;
	}

	public RobotCat(String name, String description) {
		this.name = name;
		this.description = description;
	}

}
