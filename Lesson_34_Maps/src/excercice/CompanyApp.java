package excercice;


import java.util.Scanner;

public class CompanyApp {
	public static final int ADD = 1;
	public static final int FIND = 2;
	public static final int EXIT = 0;

	public static void main(String[] args) {

		Company company = new Company();
		boolean exitApp = false;
		Scanner input = new Scanner(System.in);
		while (!exitApp) {
			try  {
				printOptions();
				switch (Integer.parseInt(input.nextLine())) {
				case ADD:
					company.add(employeeFromUser(input));
					break;
				case FIND:
					company.findAndPrint(employeeToFind(input));
					break;
				case EXIT:
					exitApp = true;
					break;
				default:
					System.out.println("Wrong value!");
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("Wrong format of value!");
			} 
		}
		input.close();

	}

	public static String employeeToFind(Scanner input) {
		System.out.print("First name of employee: ");
		String firstName = input.nextLine();
		System.out.print("Last name of employee: ");
		String lastName = input.nextLine();
		return firstName + " " + lastName;
	}

	public static Employee employeeFromUser(Scanner input) throws NumberFormatException {
		System.out.print("First name of employee: ");
		String firstName = input.nextLine();
		System.out.print("Last name of employee: ");
		String lastName = input.nextLine();
		System.out.print("Salary of employee: ");
		Integer salary = Integer.parseInt(input.nextLine());

		return new Employee(firstName, lastName, salary);
	}

	public static void add() {

	}

	public static void printOptions() {
		System.out.println("1 - Add");
		System.out.println("2 - Find");
		System.out.println("0 - Exit");
		System.out.print("Enter the value: ");
	}

}
