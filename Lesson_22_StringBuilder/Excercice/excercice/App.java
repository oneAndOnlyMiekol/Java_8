package excercice;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String wordFroUser = new String();
		StringBuilder result = new StringBuilder("Anserw: ");
		int howManyWords;
		
		System.out.println("Please enter how many words do you want to type: ");
		howManyWords=input.nextInt();
		input.nextLine();
		
		for(int i=0; i<howManyWords; i++) {
			System.out.print("Enetr " + (i+1) + " word: ");
			wordFroUser=input.nextLine();
			result.append(wordFroUser.charAt(wordFroUser.length()-1));
		}
		
		System.out.println(result);
		
		input.close();

	}

}
