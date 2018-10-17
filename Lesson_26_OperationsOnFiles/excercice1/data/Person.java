package data;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -6118738675430994102L;

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	@Override
	public String toString() {
		StringBuilder printOut = new StringBuilder("Person: ");
		printOut.append(getFirstName());
		printOut.append(" ");
		printOut.append(getLastName());
		return printOut.toString();
	}

}
