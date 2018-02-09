package amok;

import org.junit.Test;

public class CatTest {

	public static final int DEFAULT_HEALTH = 10;
	private int health = DEFAULT_HEALTH;
	
	public static final int DEFAULT_FOOD = 10;
	private int food = DEFAULT_FOOD;
	
	public static final int DEFAULT_DRINK = 10;
	private int  drink = DEFAULT_DRINK;
	
	public static final int DEFAULT_BOREDOM = 10;
	private int boredom = DEFAULT_BOREDOM;
	
	public static final int DEFAULT_POTTY = 10;
	private int potty = DEFAULT_POTTY;

	Cat underTest = new Cat("", health , food, drink , boredom, potty);
	
	@Test
	public void shouldPoopInLitterBox() {
	Organic underTest = new Cat("", health , food, drink , boredom, potty);
	
	
	
}
