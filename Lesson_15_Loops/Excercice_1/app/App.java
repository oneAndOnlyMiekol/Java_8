package app;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		
		System.out.print("Enter how many numbers do you want to add: ");
		int howManyNumbers=input.nextInt();
		input.nextLine();
		int sumOfNumbers=0;
		for(int i=0;i<howManyNumbers;i++) {
			sumOfNumbers+=input.nextInt();
			input.nextLine();
		}
		input.close();
		System.out.println("Sum of entered numbers is " + sumOfNumbers + "!");

	}

}
