package amok;

import java.util.Scanner;
import java.util.Map.Entry;





public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PetShelter shelterPets = new PetShelter();
		Cages shelterCages = new Cages(0);
		
		VirtualPet sonic = new Dog("Sonic","quikc to run");
		VirtualPet tails = new Cat("Tails", "hovers around Sonic");
		VirtualPet rush = new RobotDog ("Rush", "a mega-mans best friend");
		VirtualPet liger = new RobotCat ("Liger", "gives Zero cares about you");
		
		shelterPets.admitPet(sonic);
		shelterPets.admitPet(tails);
		shelterPets.admitPet(rush);
		shelterPets.admitPet(liger);
		
		String move;
		int turn = 0;
		int day = 0;
		do {
			System.out.println("");
			System.out.println("The VirtualPets.");
			System.out.println("________________________________________________________________________________________");
			System.out.println("Name\t\t|Health\t|Happiness\t|Hunger\t|Thirst\t|Boredom|Waste\t|Oil");

			for (Entry<String, VirtualPet> entry : shelterPets.shelter.entrySet()) {
				System.out.println(entry.getValue());
			}
			System.out.println("________________________________________________________________________________________");
			System.out.println(shelterCages);
			System.out.println("");
			turn++;
			System.out.println("What would you like to do today?");
			
			System.out.println("1. Feed the pets?");
			System.out.println("2. Water the pets?");
			System.out.println("3. Play with a pet?");
			System.out.println("4. Oil Robot pets?");
			System.out.println("5. Walk all the dogs?");
			System.out.println("6. Clean all Cages?");
			System.out.println("7. Empty all Litter boxes?");
			System.out.println("8. Adopt a pet?");
			System.out.println("9. Admit a pet?");
			System.out.println("10. Would you like to check on all the pets happiness?");
			System.out.println("11. Throw a party for all the pets?");
			System.out.println("12. Finally actually quit VirtualPet for real this time.");
			
			move = input.nextLine();
			
			if (move.equals("1")) {
				shelterPets.feedAll();
			}
			
			if (move.equals("2")) {
				shelterPets.waterAll();
			}
			
			if (move.equals("3")) {
				System.out.println("What pet would you like to play with?");
				for (VirtualPet entry : shelterPets.getAllVirtualPets()) {
					System.out.println("The pet's name is " + entry.getName() + " and it is " + entry.getDescription());
				}
				String choice = input.nextLine();
				shelterPets.playWithAPet(choice);
			}
			
			if(move.equals("4")) {
				shelterPets.oilAll();
			}
			
			if(move.equals("5")) {
				shelterPets.walkAll();
			}
			
			if(move.equals("7")) {
				shelterCages.cleanCage();
			}
//			
//			if(move.equals("8")) {
//				empty all litterboxes
//			}
			
			if (move.equals("8")) {
				System.out.println("Who would you like to adopt?");
				for (VirtualPet entry : shelterPets.getAllVirtualPets()) {
					System.out.println("The pet's name is " + entry.getName() + " and it is " + entry.getDescription());
				}
				String choice = input.nextLine();
				shelterPets.adoptPet(choice);
			}
			
			if (move.equals("9")) {
				System.out.println("What whould you like to give us?");
				System.out.println("1. Dog");
				System.out.println("2. Cat");
				System.out.println("3. RobotDog");
				System.out.println("4. RobotCat");
				String type = input.nextLine();
				if(type.equals("1")) {
					System.out.println("Whats its name?");
					String newPetName = input.nextLine();
					System.out.println("Could you give us a brief description?");
					String newPetDescription = input.nextLine();
					VirtualPet newPet = new Dog(newPetName, newPetDescription);
					shelterPets.admitPet(newPet);
				}
				if(type.equals("2")) {
					System.out.println("Whats its name?");
					String newPetName = input.nextLine();
					System.out.println("Could you give us a brief description?");
					String newPetDescription = input.nextLine();
					VirtualPet newPet = new Cat(newPetName, newPetDescription);
					shelterPets.admitPet(newPet);
				}
				if(type.equals("3")) {
					System.out.println("Whats its name?");
					String newPetName = input.nextLine();
					System.out.println("Could you give us a brief description?");
					String newPetDescription = input.nextLine();
					VirtualPet newPet = new RobotDog(newPetName, newPetDescription);
					shelterPets.admitPet(newPet);
				}
				if(type.equals("4")) {
					System.out.println("Whats its name?");
					String newPetName = input.nextLine();
					System.out.println("Could you give us a brief description?");
					String newPetDescription = input.nextLine();
					VirtualPet newPet = new RobotCat(newPetName, newPetDescription);
					shelterPets.admitPet(newPet);
				}
			}
			
			
			if(move.equals("10")) {
				for (VirtualPet entry : shelterPets.getAllVirtualPets()) {
					System.out.println(entry.getName() +" "+ entry.getHappiness());
				}
			}
			
			
			if(move.equals("11")) {
				shelterPets.funAll();
			}
			
			if (turn % 2 == 0) {
				shelterCages.soilCage();
				shelterPets.tickAll();
				;
				day++;
				System.out.println("");
				System.out.println("You have been here for " + day + " days, thanks for volunteering your time with us at");
			}
			
		}while (!(move.equals("12")));
		
		System.out.println("About time...");
		System.exit(0);
		
		input.close();
		
	}

}
