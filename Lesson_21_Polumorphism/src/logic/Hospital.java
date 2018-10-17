package logic;


import data.Person;

public class Hospital {

	final static int MAX_NUMBER_OF_EMPOLYEES = 3;

	private Person[] staffOfHospital;
	private int counterOfEmployees;

	public Person[] getStaffOfHospital() {
		return staffOfHospital;
	}

	public Hospital() {
		staffOfHospital = new Person[MAX_NUMBER_OF_EMPOLYEES];
		counterOfEmployees = 0;
	}

	public void add(Person person) {
		staffOfHospital[counterOfEmployees]=person;
		counterOfEmployees++;
	}
	
	@Override
	public String toString() {
		String result="";
		for(Person person:staffOfHospital) {
			result=result+person+"\n";
		}
		return result;
	}

}
