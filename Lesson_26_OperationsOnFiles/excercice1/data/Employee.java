package data;



public class Employee extends Person {

	
	private static final long serialVersionUID = 767319558236960897L;
	
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
	}

	public Employee(String firstName, String lastName, int salary) {
		super(firstName, lastName);
		setSalary(salary);
	}

	@Override
	public String toString() {
		StringBuilder printOut = new StringBuilder(super.toString());
		printOut.append(", ");
		printOut.append(getSalary());
		return printOut.toString();
	}

}
