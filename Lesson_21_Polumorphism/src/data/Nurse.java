package data;

public class Nurse extends Person{
	
	private double overtime;

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	
	public Nurse(String firstName, String lastName, int salary, double overtime) {
		super(firstName, lastName, salary);
		setOvertime(overtime);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", overtime: " + getOvertime();
	}
	

}
