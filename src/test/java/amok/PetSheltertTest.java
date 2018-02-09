package amok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class PetSheltertTest {
	
	private PetShelter shelterTest = new PetShelter();
	
	@Test
	public void shouldAdmitPet() {
		Dog dog = new Dog("Bill", "Wyld Stallyns member");
		shelterTest.admitPet(dog);
		Collection<VirtualPet> check = shelterTest.getAllVirtualPets();
		assertThat(check, contains(dog));
	}
	
	@Test
	public void shouldAdmitTwoPets() {
		Dog dog = new Dog("Bill", "Wyld Stallyns member");
		RobotCat roboCat = new RobotCat("Ted", "Also Wyld Stallyns member");
		shelterTest.admitPet(dog);
		shelterTest.admitPet(roboCat);
		Collection<VirtualPet> check = shelterTest.getAllVirtualPets();
		assertThat(check, contains(roboCat, dog));
	}
	
	@Test
	public void shouldAdotAPet() {
		Dog dog = new Dog("Bill", "Wyld Stallyns member");
		shelterTest.adoptPet(dog.getName());
		shelterTest.findAnimal("Bill");
		assertThat(shelterTest.findAnimal("Bill"), is(nullValue()));
	}
	
	
}
