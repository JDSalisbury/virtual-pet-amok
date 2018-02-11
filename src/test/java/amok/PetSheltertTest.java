package amok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class PetSheltertTest {

	private PetShelter shelterTest = new PetShelter();
	private static Dog dog = new Dog("Bill", "Wyld Stallyns member");
	private static Cat cat = new Cat("Rufus", "Just helping with a report");
	private static RobotDog roboDog = new RobotDog("Ted", "Also Wyld Stallyns member");

	@Test
	public void shouldAdmitPet() {
		shelterTest.admitPet(dog);
		Collection<VirtualPet> check = shelterTest.getAllVirtualPets();
		assertThat(check, contains(dog));
	}

	@Test
	public void shouldAdmitTwoPets() {
		shelterTest.admitPet(dog);
		shelterTest.admitPet(roboDog);
		Collection<VirtualPet> check = shelterTest.getAllVirtualPets();
		assertThat(check, contains(roboDog, dog));
	}

	@Test
	public void shouldAdotAPet() {
		shelterTest.adoptPet(dog.getName());
		shelterTest.findAnimal("Bill");
		assertThat(shelterTest.findAnimal("Bill"), is(nullValue()));
	}

	@Test
	public void shouldFeedAllOrganicPets() {
		shelterTest.admitPet(dog);
		shelterTest.admitPet(cat);
		shelterTest.feedAll();
		assertThat(dog.getFood(), is(1));
		assertThat(cat.getFood(), is(1));
	}

	@Test
	public void shouldWaterAllOrganicPets() {
		shelterTest.admitPet(dog);
		shelterTest.admitPet(cat);
		shelterTest.waterAll();
		assertThat(dog.getDrink(), is(1));
		assertThat(cat.getDrink(), is(1));
	}

	@Test
	public void shouldPlayWithAll() {
		shelterTest.admitPet(cat);
		shelterTest.admitPet(dog);
		shelterTest.admitPet(roboDog);
		shelterTest.funAll();
		assertThat(cat.getBoredom(), is(-3));
	}

	@Test
	public void shouldWalkAll() {
		shelterTest.admitPet(dog);
		shelterTest.admitPet(roboDog);
		shelterTest.walkAll();
		assertThat(dog.getBoredom(), is(-1));
		assertThat(roboDog.getBoredom(), is(-1));
	}

	@Test
	public void shouldOilAllRobots() {
		shelterTest.admitPet(roboDog);
		shelterTest.oilAll();
		assertThat(roboDog.getOiled(), is(0));
	}

	@Test
	public void shouldPlayWithOnePet() {
		shelterTest.admitPet(dog);
		shelterTest.playWithAPet("Bill");
		assertThat(dog.getBoredom(), is(-7));
	}

}
