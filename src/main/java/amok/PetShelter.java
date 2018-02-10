package amok;

import java.util.HashMap;
import java.util.Map;

import java.util.Collection;

public class PetShelter {

	Map<String, VirtualPet> shelter = new HashMap<>();

	public void admitPet(VirtualPet pet) {
		shelter.put(pet.getName(), pet);
	}

	public Collection<VirtualPet> getAllVirtualPets() {
		return shelter.values();
	}

	public void adoptPet(String name) {
		shelter.remove(name);
	}

	public VirtualPet findAnimal(String name) {
		return shelter.get(name);
	}

	public void feedAll() {
		for (VirtualPet pet : getAllVirtualPets()) {
			((Organic) pet).feed();
		}
	}

	public void waterAll() {
		for (VirtualPet pet : getAllVirtualPets()) {
			((Organic) pet).water();
		}
	}

	public void funAll() {
		for (VirtualPet pet : getAllVirtualPets()) {
			pet.play();
		}
	}

	public void walkAll() {
		for (VirtualPet pet : getAllVirtualPets()) {
			((Walkable) pet).goOnWalk();
		}

	}

	public void tickAll() {
		for (VirtualPet pet : getAllVirtualPets()) {
			pet.tick();
		}

	}

	public void playWithAPet(String name) {
		shelter.get(name).play();

	}

	public void oilAll() {
		for (VirtualPet pet : getAllVirtualPets()) {
			((Robot) pet).oil();
		}
	}

}
