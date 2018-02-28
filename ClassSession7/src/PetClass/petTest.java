package PetClass;

public class petTest {
	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.setName("Stitch");
		pet1.setAge(2.8);
		pet1.setSpecies("Dog");
		pet1.setBreed("Chow Chow");
		pet1.setWeight(72);
		pet1.setowner("Kyle");
		System.out.println(pet1);

		Pet pet2 = new Pet("Cookie", "cat");

		pet2.setAge(5.6);
		pet2.setBreed("Ugly");
		pet2.setWeight(25);
		pet2.setowner("Lame ass noob");

		System.out.println(pet2);
		if (pet1.equals(pet2)) {
			System.out.println("They are the same.");
		} else {
			System.out.println("They are not the same.");
		}
		System.out.println(pet1.getPetCount());
		System.out.println(pet2.getPetCount());

	}
}
