package data;

import java.io.Serializable;

public class Company implements Serializable {

	private static final long serialVersionUID = 1542699651132570466L;

	public static final int MAX_NUMBER_OF_EMPLOYEES = 10;

	private Employee[] arrayOfEmployees;
	private int numberOfEmployees;
	
	public Employee[] getArrayOfEmployees() {
		return arrayOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public Company() {
		arrayOfEmployees = new Employee[MAX_NUMBER_OF_EMPLOYEES];
		numberOfEmployees = 0;
	}
	
	public void addEmployee(Employee employee) {
		arrayOfEmployees[numberOfEmployees]=employee;
		numberOfEmployees++;
	}
	
	@Override
	public String toString() {
		StringBuilder printOut = new StringBuilder();
		for(int i=0; i<numberOfEmployees; i++) {
			printOut.append(i+1);
			printOut.append(". ");
			printOut.append(arrayOfEmployees[i]);
			printOut.append("\n");
		}
		return printOut.toString();
	}

}
