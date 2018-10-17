package data;

import java.util.Arrays;

import util.RandomPerson;

public class PersonDatabase {

	private Person[] personDatabase;
	private int arrayPlaceCounter;
	private RandomPerson randomPersonGenerator;

	public int getArrayPlaceCounter() {
		return arrayPlaceCounter;
	}

	public void setArrayPlaceCounter(int arrayPlaceCounter) {
		this.arrayPlaceCounter = arrayPlaceCounter;
	}

	public Person[] getPersonDatabase() {
		return personDatabase;
	}

	public void setPersonDatabase(Person[] personDatabase) {
		this.personDatabase = personDatabase;
	}

	public RandomPerson getRandomPersonGenerator() {
		return randomPersonGenerator;
	}

	public void setRandomPersonGenerator(RandomPerson randomPersonGenerator) {
		this.randomPersonGenerator = randomPersonGenerator;
	}

	public PersonDatabase() {
		setPersonDatabase(new Person[1]);
		setArrayPlaceCounter(0);
		setRandomPersonGenerator(new RandomPerson());
	}

	private void checkPersonDatabaseSize() {
		if (getPersonDatabase().length == getArrayPlaceCounter()) {
			personDatabase = Arrays.copyOf(personDatabase, personDatabase.length*2);
		}

	}

	public void removePatient(Person person) {

		if (person != getPersonDatabase()[getArrayPlaceCounter() - 1]) {
			int indexOfPersonToRemove = 0;
			for (int i = 0; i < getArrayPlaceCounter(); i++) {
				if (person.equals(getPersonDatabase()[i]))
					indexOfPersonToRemove = i;
			}
			System.arraycopy(personDatabase, indexOfPersonToRemove+1, personDatabase, indexOfPersonToRemove, personDatabase.length-indexOfPersonToRemove-1);
		
		setArrayPlaceCounter(getArrayPlaceCounter() - 1);
		}
	}

	public Person get(int index) {
		if (index < 0 || index > getArrayPlaceCounter()) {
			System.out.println("Invalid data!");
			return null;
		}

		return getPersonDatabase()[index];
	}

	public int size() {
		return getArrayPlaceCounter();
	}

	public void add(Person person) {
		checkPersonDatabaseSize();
		personDatabase[getArrayPlaceCounter()] = person;
		setArrayPlaceCounter(getArrayPlaceCounter() + 1);
	}

	public void addRandom() {
		add(randomPersonGenerator.createRandomPerson());
	}

	public static <T> void printArray(T[] array) {
		int counterOfWrittenObjects = 0;
		for (T t : array) {
			if (t != null) {
				System.out.print((++counterOfWrittenObjects) + ". " + t + "\n");
			}

		}
		System.out.println();
	}
}
