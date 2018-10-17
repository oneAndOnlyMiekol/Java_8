package exercise;

public class Employee {
	String firstName;
	String lastName;
	int yearOfBirth;
	double seniority;

	public Employee(String firstName, String lastName, int yearOfBirth, double seniority) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.yearOfBirth=yearOfBirth;
		this.seniority=seniority;
	}
	
	@Override
	public String toString() {
		String employeeInfo="Imiê i Nazwisko: " + firstName + " " + lastName + "\nRok urodzenia: " + yearOfBirth + "\nSta¿ pracy: " + seniority + "\n";
		return employeeInfo;
	}
}
