package amok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CatTest {

	public static final String DEFAULT_DESCRIPTION = "It is alright";
	private String description = DEFAULT_DESCRIPTION;

	public static final int DEFAULT_HEALTH = 10;
	private int health = DEFAULT_HEALTH;

	public static final int DEFAULT_FOOD = 10;
	private int food = DEFAULT_FOOD;

	public static final int DEFAULT_DRINK = 10;
	private int drink = DEFAULT_DRINK;

	public static final int DEFAULT_BOREDOM = 10;
	private int boredom = DEFAULT_BOREDOM;

	public static final int DEFAULT_POTTY = 10;
	private int potty = DEFAULT_POTTY;

	public static final int DEFAULT_HAPPINESS = 10;
	private int happiness = DEFAULT_HAPPINESS;

	@Test
	public void shouldMakeOrganicCat() {
		Organic underTest = new Cat("", description, health, food, drink, boredom, potty, happiness);
		underTest.getName();
		assertThat(underTest.getName(), is(""));
	}

}
