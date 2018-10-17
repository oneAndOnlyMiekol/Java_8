package excercice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CollectionSorter {

	public static void main(String[] args) {

		List<String> listOfNames = new ArrayList<>();

		try (Scanner input = new Scanner(System.in);) {
			generate(listOfNames, 5, input::nextLine);
		}
		Collections.sort(listOfNames, String::compareToIgnoreCase);
		applyToAll(listOfNames, System.out::println);

	}

	public static <T> void generate(List<T> list, int howMany, Supplier<T> supplier) {
		for (int i = 0; i < howMany; i++) {
			list.add(supplier.get());
		}
	}

	public static <T> void applyToAll(List<T> list, Consumer<T> consume) {
		for (T t : list) {
			consume.accept(t);
		}
	}

}
