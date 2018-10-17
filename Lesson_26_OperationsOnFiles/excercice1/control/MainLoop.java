package control;


import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import data.Company;
import data.Employee;
import data.Option;

public class MainLoop {

	private Scanner input;
	private Company company;
	private FileManager fileManager;
	private RandomEmployee randomEmployee;

	public MainLoop() {
		input = new Scanner(System.in);
		company = new Company();
		fileManager = new FileManager();
		randomEmployee = new RandomEmployee();
	}

	private void printOption() {
		System.out.println("\nChoose one of options below:");
		for (Option option : Option.values())
			System.out.println(option);
		System.out.print("Enter correct value: ");
	}

	private void exit() {
		System.out.println("\nGoodbye!");
		input.close();
	}
	
	private void printFile() {
		System.out.println(company);
	}
	
	private void saveFile() {
		fileManager.saveFile(company);
	}
	
	private void loadFile() {
		company=fileManager.loadFile();
	}
	
	private void createRandomEmployee() {
		company.addEmployee(randomEmployee.createRandomEmployee());
	}
	
	private void createRestOfEmployeesRandom() {
		for(int i=company.getNumberOfEmployees();i<Company.MAX_NUMBER_OF_EMPLOYEES;i++) {
			company.addEmployee(randomEmployee.createRandomEmployee());
		}
	}
	
	private void readFromUser() {
		System.out.print("\nEnter first name: ");
		String firstName=input.nextLine();
		System.out.print("\nEnter last name: ");
		String lastName=input.nextLine();
		System.out.print("\nEnter salary: ");
		int salary=input.nextInt();
		input.nextLine();
		company.addEmployee(new Employee(firstName, lastName, salary));
	}

	public void startLoop() {
		Option option = null;

		while (option != Option.EXIT_PROGRAM) {
			try {
				
				printOption();
				option = Option.optionFromInt(input.nextInt());
				input.nextLine();
				switch (option) {
				case EXIT_PROGRAM:
					exit();
					break;
				case PRINT_FROM_FILE:
					printFile();
					break;
				case READ_FROM_FILE:
					loadFile();
					break;
				case READ_FROM_USER:
					readFromUser();
					saveFile();
					break;
				case WRITE_NEW_RANDOM_EMPLOYEE:
					createRandomEmployee();
					saveFile();
					break;
				case WRITE_WHOLE_FILE_RANDOM:
					createRestOfEmployeesRandom();
					break;
				default:
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("\nEntered value is not type of int!");
				input.nextLine();

			} catch (NoSuchElementException e) {
				System.out.println(e.getMessage());
				input.nextLine();

			} 
		}

	}

}
