package one;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			ints.add(i);
		}

		System.out.println("ints.get(50) = " + ints.get(50));
		System.out.println("Ilo�� element�w na li�cie: " + ints.size());
		System.out.println("Czyszcz� tablic�: ");
		ints.clear();
		System.out.println("Ilo�� element�w na li�cie: " + ints.size());
	}
}
