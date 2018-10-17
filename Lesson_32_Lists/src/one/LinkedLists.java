package one;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		LinkedList<Integer> ints = new LinkedList<>();

		for (int i = 0; i < 100; i++) {
			ints.add(i);
		}

		System.out.println("ints.get(50) = " + ints.get(50));
		System.out.println("Iloœæ elementów na liœcie: " + ints.size());
		System.out.println("Czyszczê tablicê: ");
		ints.clear();
		System.out.println("Iloœæ elementów na liœcie: " + ints.size());
	}

}
