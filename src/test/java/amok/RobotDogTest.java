package amok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RobotDogTest {

	public static final String DEFAULT_NAME = "Astro";
	private String name = DEFAULT_NAME;

	public static final String DEFAULT_DESCRIPTION = "It is alright";
	private String description = DEFAULT_DESCRIPTION;

	public static final int DEFAULT_OIL = 10;
	private int oil = DEFAULT_OIL;

	public static final int DEFAULT_HEALTH = 10;
	private int health = DEFAULT_HEALTH;

	public static final int DEFAULT_BOREDOM = 10;
	private int boredom = DEFAULT_BOREDOM;

	public static final int DEFAULT_HAPPINESS = 10;
	private int happiness = DEFAULT_HAPPINESS;

	RobotDog underTest = new RobotDog(name, description, oil, health, boredom, happiness);

	@Test
	public void shouldGetOiled() {

		underTest.getOiled();
		assertThat(underTest.getOiled(), is(10));
	}

	@Test
	public void shouldGoOnWalk() {
		underTest.goOnWalk();
		assertThat(underTest.getBoredom(), is(9));
		assertThat(underTest.getHappiness(), is(11));
		assertThat(underTest.getHealth(), is(11));

	}

}
