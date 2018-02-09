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
	
	
	
}
