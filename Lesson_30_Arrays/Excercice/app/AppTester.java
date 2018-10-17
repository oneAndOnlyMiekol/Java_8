package app;

import data.Person;
import data.PersonDatabase;
import util.RandomPerson;

public class AppTester {

	public static void main(String[] args) {
		
		PersonDatabase personDatabase = new PersonDatabase();
		RandomPerson randomPersonGenerator = new RandomPerson();
		personDatabase.add(randomPersonGenerator.createRandomPerson());
		personDatabase.add(randomPersonGenerator.createRandomPerson());
		
		PersonDatabase.printArray(personDatabase.getPersonDatabase());
		System.out.println(personDatabase.getPersonDatabase().length);
		Person personToRemove = new Person("Ana", "Doe", "123456789");
		
		personDatabase.add(personToRemove);
		personDatabase.add(randomPersonGenerator.createRandomPerson());
		personDatabase.addRandom();
		
		PersonDatabase.printArray(personDatabase.getPersonDatabase());
		System.out.println(personDatabase.getPersonDatabase().length);
		personDatabase.removePatient(personToRemove);
		
		PersonDatabase.printArray(personDatabase.getPersonDatabase());
		System.out.println(personDatabase.getPersonDatabase().length);
		personDatabase.add(randomPersonGenerator.createRandomPerson());
		personDatabase.add(randomPersonGenerator.createRandomPerson());
		personDatabase.add(randomPersonGenerator.createRandomPerson());
		personDatabase.add(randomPersonGenerator.createRandomPerson());
		personDatabase.add(randomPersonGenerator.createRandomPerson());
		personDatabase.add(randomPersonGenerator.createRandomPerson());
		
		PersonDatabase.printArray(personDatabase.getPersonDatabase());
		System.out.println(personDatabase.getPersonDatabase().length);
		System.out.println(personDatabase.get(39));
		System.out.println(personDatabase.get(4));
		System.out.println(personDatabase.size());
		
		
		
		
		
		

	}

}
