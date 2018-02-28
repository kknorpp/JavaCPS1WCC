package PetClass;

import java.util.Scanner;

public class Pet {

	private String name;
	private double age;
	private String ownerName;
	private String species;
	private String breed;
	private int weight;
	private static int petCount;

	public Pet() {
		this.name = "Stitch";
		this.age = 2;
		this.ownerName = "Kyle";
		this.species = "Dog";
		this.breed = "Chow Chow";
		this.weight = 70;
		petCount++;
	}

	public Pet(String name, String species) {
		this.age = 2;
		this.name = name;
		this.ownerName = "unknown";
		this.species = species;
		this.breed = "unknown";
		this.weight = 70;
		petCount++;
	}

	public int getPetCount() {
		return petCount;
	}

	public boolean isOverWeight() {
		if (this.species.equalsIgnoreCase("cat") && this.weight > 14) {
			return true;
		} else {
			return false;
		}

	}

	public Pet(int age) {
		this.name = "Stitch";
		this.age = age;
		this.ownerName = "Kyle";
		this.species = "Dog";
		this.breed = "Chow Chow";
		this.weight = 70;

	}

	public Pet(String name) {
		this.name = name;
		this.age = 2;
		this.ownerName = "Kyle";
		this.species = "Dog";
		this.breed = "Chow Chow";
		this.weight = 70;
	}

	public String getName() {
		return this.name;
	}

	public double getAge() {
		return this.age;
	}

	public String getOwner() {
		return this.ownerName;
	}

	public String getSpecies() {
		return this.species;
	}

	public String getBreed() {
		return this.breed;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(double age) {
		if (age <= 0) {
			System.out.println("Not a valid age.");
		} else {
			this.age = age;
		}
	}

	public void setowner(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setWeight(int weight) {
		if (weight <= 0) {
			System.out.println("Not a valid weight.");
		} else {
			this.weight = weight;
		}
	}

	public boolean equals(Pet otherPet) {
		if (this.name.equals(otherPet.name) && this.ownerName.equals(otherPet.ownerName)
				&& this.species.equals(otherPet.species)) {
			return true;
		} else {
			return false;

		}
	}

	@Override
	public String toString() {
		if (isOverWeight()) {
			return "The pet is a " + this.species + " that is " + this.age + " years old. I'ts name is " + this.name
					+ ". The breed is " + this.breed + " weighs " + this.weight
					+ " pounds, is over weight, and is owned by " + this.ownerName + ".";
		}
		return "The pet is a " + this.species + " that is " + this.age + " years old. I'ts name is " + this.name
				+ ". The breed is " + this.breed + " weighs " + this.weight + " pounds, and is owned by "
				+ this.ownerName + ".";
	}

	public static void main(String[] args) {
		System.out.println("Please enter your pets Name, Age, Species, Breed, and Weight. As well your name.");
		Scanner keyInput = new Scanner(System.in);

		Pet pet1 = new Pet();
		Pet pet2 = new Pet(keyInput.nextLine());
		System.out.println(pet1.toString());
		System.out.println(pet2.toString());
	}
}
