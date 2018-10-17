package excercice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Randomizer {

	public static void main(String[] args) {

		Random random = new Random();
		List<Integer> listOfInt = new LinkedList<>();
		
		generate(listOfInt, 10, ()->random.nextInt(1000));
		applyToAll(listOfInt, l->System.out.print(l + " "));
		checkAllListAndErase(listOfInt, l->l%2==0);
		System.out.println("\n\n");
		applyToAll(listOfInt, l->System.out.print(l + " "));
	}

	public static <T> void generate(List<T> list, int howMany, Supplier<T> supplier) {
		for (int i = 0; i < howMany; i++) {
			list.add(supplier.get());
		}
	}

	public static <T> void applyToAll(List<T> list, Consumer<T> consume) {
		for(T t:list) {
			consume.accept(t);
		}
	}

	public static <T> void checkAllListAndErase(List<T> list, Predicate<T> predicate) {
		Iterator<T> listIterator = list.iterator();
		while(listIterator.hasNext()) {
			if(predicate.test(listIterator.next()))
				listIterator.remove();
		}
	}
}

