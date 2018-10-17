package logic;

import java.util.Scanner;

import data.Patient;
import data.PatientData;

public class Hospital {

	private final static String EXIT_APP = "0";
	private final static String ADD_PATIENT = "1";
	private final static String PRINT_ACTIVE_PATIENT_QUEUE = "2";
	private final static String PRINT_WHOLE_PATIENT_QUEUE = "3";
	private final static String REMOVE_PATIENT = "4";
	private final static String GENERATE_PATIENTS = "5";

	private int numberOfPatients = 0;
	private final int maxNumberOfPatients = 10;
	private Patient[] queueOfPatients;
	private PatientData randomPatient;
	private Scanner input;

	public Hospital() {
		this.queueOfPatients = new Patient[maxNumberOfPatients];
		this.input = new Scanner(System.in);
		this.randomPatient = new PatientData();
	}

	private void addPatientToQueue() {
		if (maxNumberOfPatients == numberOfPatients) {
			System.out.println("\nMaximal number of patients is already in queue!");
		} else {
			this.queueOfPatients[numberOfPatients] = createNewPatient();
			numberOfPatients++;
		}
	}

	private void generateRandomPatientQueue() {
		for (int i = numberOfPatients; i < maxNumberOfPatients; i++) {
			this.queueOfPatients[i] = randomPatient.createRandomPatient();
		}
		numberOfPatients = maxNumberOfPatients;

	}

	private Patient createNewPatient() {
		System.out.print("Enter the First name: ");
		String firstName = input.nextLine();
		System.out.print("Enter the Last name: ");
		String lastName = input.nextLine();
		System.out.print("Enter the PESEL number: ");
		String pesel = input.nextLine();
		return new Patient(firstName, lastName, pesel);
	}

	private void removePatient() {
		System.out.print("Enter number of patient you want to remove from queue: ");
		int numberOfPatientToRemove = input.nextInt();
		input.nextLine();
		if (numberOfPatientToRemove > numberOfPatients || numberOfPatientToRemove < 1) {
			System.out.println("Entered data is invalid!");
		} else {
			if (numberOfPatientToRemove != numberOfPatients) {
				for (int i = numberOfPatientToRemove-1; i < numberOfPatients-1; i++) {
					queueOfPatients[i].setFirstName(queueOfPatients[i + 1].getFirstName());
					queueOfPatients[i].setLastName(queueOfPatients[i + 1].getLastName());
					queueOfPatients[i].setPesel(queueOfPatients[i + 1].getPesel());
				}
			}
			queueOfPatients[numberOfPatients-1] = null;
			numberOfPatients--;
		}
	}

	private void printWholeQueue() {
		int counterOfPatients = 1;
		System.out.println();
		for (Patient tempQueue : queueOfPatients) {
			System.out.println(counterOfPatients++ + ". " + tempQueue);
		}
		counterOfPatients = 1;
	}

	private void printActiveQueue() {
		System.out.println();
		for (int i = 0; i < numberOfPatients; i++) {
			System.out.println((i + 1) + ". " + queueOfPatients[i]);
		}
	}

	public void startTheApp() {
		boolean runApp = true;
		do {
			System.out.println();
			System.out.println(EXIT_APP + " - Exit the Hospital App");
			System.out.println(ADD_PATIENT + " - Add new patient to queue");
			System.out.println(PRINT_ACTIVE_PATIENT_QUEUE + " - Print active queue of patients");
			System.out.println(PRINT_WHOLE_PATIENT_QUEUE + " - Print whole queue of patients");
			System.out.println(REMOVE_PATIENT + " - Remove patient from queue");
			System.out.println(GENERATE_PATIENTS + " - Generate random patients");
			System.out.print("Choose one of the options and enter the correct number: ");

			switch (input.nextLine()) {
			case EXIT_APP:
				runApp = false;
				input.close();
				break;
			case ADD_PATIENT:
				this.addPatientToQueue();
				break;
			case PRINT_WHOLE_PATIENT_QUEUE:
				this.printWholeQueue();
				break;
			case REMOVE_PATIENT:
				this.removePatient();
				break;
			case GENERATE_PATIENTS:
				this.generateRandomPatientQueue();
				break;
			case PRINT_ACTIVE_PATIENT_QUEUE:
				this.printActiveQueue();
				break;
			default:
				System.out.println("Entered data is invalid!");
				break;
			}
		} while (runApp);
	}

}
