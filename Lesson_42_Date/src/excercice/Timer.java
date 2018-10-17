package excercice;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Timer {

	public static void main(String[] args) {
		LocalTime startTime;
		LocalTime stopTime;
		System.out.println("Timer ver.0.1");
		System.out.println("\nPress Enter to start counting!");
		try(Scanner input = new Scanner(System.in);){
			input.nextLine();
			startTime=LocalTime.now();
			System.out.println("\nPress Enter to stop counting!");
			input.nextLine();
			stopTime=LocalTime.now();
		}
		Duration countedTime = Duration.between(startTime, stopTime);
		System.out.println("\n Your time is " + countedTime.getSeconds() + " seconds");

	}

}
