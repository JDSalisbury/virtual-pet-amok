package amok;

public class RoboDog extends Robot  {

	public RoboDog(String name, String description, int oil, int health, int boredom, int happiness) {
		this.oil = oil;
		this.name = name;
		this.description = description;
		this.health = health;
		this.boredom = boredom;
		this.happiness = happiness;
	}
	
	public RoboDog(String name, String description) {
		this.name = name;
		this.description = description;
	}

//	@Override
//	public void goOnWalk() {
//	 int walking = 1;
//	 boredom -= walking;
//	 health += walking;
//	 happiness += walking;
//		
//	}
	
	
	
	

}
