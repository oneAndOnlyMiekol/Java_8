package util;

import java.util.Random;

import data.Person;

public class RandomPerson {
	Random rand = new Random();
	String[] firstNames = { "Mark", "Tom", "Jack", "Bob", "Jackie", "Jenny", "Philip", "Jerohme", "Billy", "Happy",
							"Jay", "Allan", "Marie" };
	String[] lastNames = { "Sting", "Doe", "Ball", "Slater", "Underwood", "Holden", "Jobs", "Martin", "Kava",
						   "Simmons" };
	String[] pesels = new String[15];
	private int peselLenght = 11;

	private String createPesel() {
		String newPesel="";
		for (int i = 0; i < peselLenght; i++) {
			newPesel= newPesel + (rand.nextInt(10));
		}
		return newPesel;
	}
	
	private void createPeselArray() {
		for(int i=0; i<pesels.length; i++) {
			pesels[i]=this.createPesel();
		}
	}
	public Person createRandomPerson() {
		this.createPeselArray();
		String firstName = firstNames[rand.nextInt(firstNames.length)];
		String lastName = lastNames[rand.nextInt(lastNames.length)];
		String pesels = this.pesels[rand.nextInt(this.pesels.length)];
		return new Person(firstName, lastName, pesels);
	}
	

}
