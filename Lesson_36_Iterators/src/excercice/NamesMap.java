package excercice;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NamesMap {
	public static final int ADD = 1;
	public static final int PRINT = 2;
	public static final int EXIT = 0;

	public static void main(String[] args) {

		Map<String, Person> personMap = new TreeMap<>();
		try (Scanner input = new Scanner(System.in);) {
			int option = 0;
			do {
				printOptions();

				switch (option = Integer.parseInt(input.nextLine())) {
				case ADD:
					add(input, personMap);
					break;
				case PRINT:
					print(personMap);
					break;
				case EXIT:

					break;
				default:
					break;
				}
			} while (option != 0);
		}

	}

	public static Person personFromUser(Scanner input) throws NumberFormatException {
		System.out.print("First name of person: ");
		String firstName = input.nextLine();
		System.out.print("Last name of person: ");
		String lastName = input.nextLine();
		System.out.print("Age of person: ");
		Integer age = Integer.parseInt(input.nextLine());

		return new Person(firstName, lastName, age);
	}

	public static void add(Scanner input, Map<String, Person> personMap) {
		Person personToAdd = personFromUser(input);
		personMap.put(personToAdd.getLastName(), personToAdd);

	}
	
	public static void print(Map<String, Person> personMap) {
		Iterator<Person> personMapIterator=personMap.values().iterator();
		StringBuilder result = new StringBuilder(32);
		while(personMapIterator.hasNext()) {
			result.append(personMapIterator.next());
			result.append(" ");
		}
		System.out.println(result.toString());
	}

	public static void printOptions() {
		System.out.println("1 - Add");
		System.out.println("2 - Print");
		System.out.println("0 - Exit");
		System.out.print("Enter the value: ");
	}

}
