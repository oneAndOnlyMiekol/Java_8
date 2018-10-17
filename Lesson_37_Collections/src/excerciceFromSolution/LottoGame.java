package excerciceFromSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
	public static void main(String[] args) {
		List<Integer> userNumbers = new ArrayList<>();
		
		System.out.println("Witamy w losowaniu Lotto! Podaj swoje typy.");
		try (Scanner sc = new Scanner(System.in);) {
			int numbers = 6;
			while(numbers > 0) {
				System.out.println("Podaj kolejn� liczb�:");
				userNumbers.add(sc.nextInt());
				sc.nextLine();
				numbers--;
			}
		}
		
		Lotto lotto = new Lotto();
		lotto.randomize();
		int found = lotto.checkResult(userNumbers);
		System.out.println("Trafione liczby: " + found);
	}
}