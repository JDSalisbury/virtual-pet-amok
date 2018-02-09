package amok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RobotCatTest {

	public static final String DEFAULT_NAME = "Jonesy";
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

	@Test
	public void shouldGetOilForRobotCat() {
		Robot underTest = new RobotCat(name, description, oil, health, boredom, happiness);
		underTest.getOiled();
		assertThat(underTest.getOiled(), is(10));
	}
	@Test
	public void shouldGetName() {
		Robot underTest = new RobotCat(name, description, oil, health, boredom, happiness);
		underTest.getName();
		assertThat(underTest.getName(), is("Jonesy"));
	}
}
