package excercice;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		Calculator calculator = new Calculator();
		boolean error = true;
		double firstNumber;
		double secondNumber;
		String operator;

		while (error) {
			try {
				System.out.print("Enter first double type number: ");
				firstNumber = input.nextDouble();
				input.nextLine();
				System.out.print("Enter operator: ");
				operator = input.nextLine();
				
				System.out.print("Enter second double type number: ");
				secondNumber = input.nextDouble();
				input.nextLine();
				System.out.println("Anserw: " + calculator.Calculate(firstNumber, secondNumber, operator));
				error=false;

			} catch (InputMismatchException e) {
				System.err.println("Given number is not type of double!");
				input.nextLine();

			} catch (UnknownOperatorExeption e) {
				System.err.println(e.getMessage());

			} catch (ArithmeticException e) {
				System.err.println(e.getMessage());
				
			}

		}
		input.close();

	}

}
