package amok;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DogTest {

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

	Dog underTest = new Dog("", description, health, food, drink, boredom, potty, happiness);

	@Test
	public void shouldGetFoodFromOrganic() {
		Organic underTest = new Dog("", description, health, food, drink, boredom, potty, happiness);
		int check = underTest.getFood();
		assertThat(check, is(10));
	}

	@Test
	public void shouldGetDrinkFromOrganic() {
		assertThat(underTest.getDrink(), is(10));
	}

	@Test
	public void shouldGetPottyFromOrganic() {
		Organic underTest = new Dog("", description, health, food, drink, boredom, potty, happiness);
		assertThat(underTest.getPotty(), is(10));
	}

	@Test
	public void shouldGetHealthFromVirtualPet() {
		VirtualPet underTest = new Dog("", description, health, food, drink, boredom, potty, happiness);
		int check = underTest.getHealth();
		assertThat(check, is(10));
	}

	@Test
	public void shouldGetBoredomFromVirtualPet() {
		VirtualPet underTest = new Dog("", description, health, food, drink, boredom, potty, happiness);
		assertThat(underTest.getBoredom(), is(10));
	}

	@Test
	public void shouldGetNameFromVirtualPet() {
		VirtualPet underTest = new Dog("", description, health, food, drink, boredom, potty, happiness);
		assertThat(underTest.getName(), is(""));
	}

	@Test
	public void shouldGetDescriptionFromVirtualPet() {
		VirtualPet underTest = new Dog("", description, health, food, drink, boredom, potty, happiness);
		assertThat(underTest.getDescription(), is("It is alright"));
	}

	@Test
	public void shouldEat() {
		Organic underTest = new Dog("", description, health, food, drink, boredom, potty, happiness);
		underTest.feed();
		assertThat(underTest.getFood(), is(11));
	}

	@Test
	public void shouldDrink() {
		Organic underTest = new Dog("", description, health, food, drink, boredom, potty, happiness);
		underTest.water();
		assertThat(underTest.getDrink(), is(11));
	}

	@Test
	public void shouldGoToRestroom() {
		Organic underTest = new Dog("", description, health, food, drink, boredom, potty, happiness);
		underTest.bathroom();
		assertThat(underTest.getPotty(), is(9));
	}

	@Test
	public void shouldPlay() {
		underTest.play();
		assertThat(underTest.getBoredom(), is(9));
	}

	@Test
	public void shouldGoOnWalk() {
		underTest.goOnWalk();
		assertThat(underTest.getBoredom(), is(9));
		assertThat(underTest.getHealth(), is(11));
		assertThat(underTest.getPotty(), is(9));
		assertThat(underTest.getHappiness(), is(11));
	}

}
