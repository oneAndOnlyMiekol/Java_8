package excercice;


import java.util.Map;
import java.util.TreeMap;

public class Company {

	private Map<String, Employee> company;

	public Company() {
		company = new TreeMap<>();
	}
	
	public void add(Employee employee) {
		company.put(employee.getFirstName() + " " + employee.getLastName(), employee);
	}
	
	public void findAndPrint(String firstAndLastName) {
		System.out.println(company.get(firstAndLastName).toString());
	}

}
