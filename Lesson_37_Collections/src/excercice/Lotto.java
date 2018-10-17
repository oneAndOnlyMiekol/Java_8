package excercice;


import java.util.Collections;
import java.util.LinkedList;

import java.util.List;

public class Lotto {

	public static final int LOW_NUMBER_LIMIT = 1;
	public static final int HIGH_NUMBER_LIMIT = 49;
	public static final int HOW_MANY_NUMBERS_TO_CHECK = 6;

	private List<Integer> numbersToShuffle;

	public List<Integer> getNumbersToShuffle() {
		return numbersToShuffle;
	}

	public void setNumbersToShuffle(List<Integer> numbersToShuffle) {
		this.numbersToShuffle = numbersToShuffle;
	}

	public Lotto() {
		numbersToShuffle = new LinkedList<>();
	}

	public void generate() {
		numbersToShuffle.clear();
		for (int i = LOW_NUMBER_LIMIT; i < HIGH_NUMBER_LIMIT + 1; i++) {
			numbersToShuffle.add(i);
		}
	}

	public void randomize() {
		if (numbersToShuffle.size() == 0) {
			System.out.println("Numbers need to be generated earlier. Numbers generated!");
			generate();
		}
		Collections.shuffle(numbersToShuffle);
		Collections.shuffle(numbersToShuffle);
		Collections.shuffle(numbersToShuffle);
	}
	
	public void print() {
		printArray(numbersToShuffle.toArray());
	}

	public List<Integer> checkResult(List<Integer> numbers) {
		List<Integer> numbersThatWhereAccurate = new LinkedList<>();
		for (Integer tempNumbers : numbers) {
			for (int i = 0; i < HOW_MANY_NUMBERS_TO_CHECK; i++) {
				if (numbersToShuffle.get(i)==(tempNumbers))
					numbersThatWhereAccurate.add(tempNumbers);
			}
			
		}
		if(numbersThatWhereAccurate.size()==0) {
			System.out.println("You didn't enter any accurate number");
			return null;
		}
		System.out.println("Congratulations! You entered " + numbersThatWhereAccurate.size() + " accurate numbers!");
		printArray(numbersThatWhereAccurate.toArray());
		return numbersThatWhereAccurate;
			

	}
	
	public static <T> void printArray(T[] arr) {
		for(T t: arr) {
			System.out.print(t + " ");
		}
		System.out.println();
	}

}
