package app;

import java.util.Locale;
import java.util.Scanner;

import logic.Logic;

public class Excercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		Logic calculate = new Logic();
		
		System.out.println("Enter the first number: ");
		double firstNumber=input.nextDouble();
		input.nextLine();
		System.out.println("Enter the matematic sign (only +, -, *, / allowed): ");
		String matematicSigh=input.nextLine();
		System.out.println("Enter the second number: ");
		double secondNumber=input.nextDouble();
		input.nextLine();
		input.close();
		System.out.println("Answer: " + calculate.Calculate(firstNumber, secondNumber, matematicSigh));

	}

}
