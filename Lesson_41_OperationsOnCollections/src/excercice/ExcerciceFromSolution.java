package excercice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExcerciceFromSolution {
	public static void main(String[] args) throws IOException {
		final String FILE_NAME = "lorem ipsum.txt";
		BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
		List<String> words = new ArrayList<>();
		String tmp = null;

		while ((tmp = br.readLine()) != null) {
			words.addAll(Arrays.asList(tmp.split(" ")));
		}
		
		words = words.stream().map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
				.collect(Collectors.toList());

		long countSWords = words.stream().filter(s -> s.startsWith("s"))
				.peek(s -> System.out.print(s + " ")).count();
		System.out.println();

		long fiveLetters = words.stream().filter(s -> s.length() == 5)
				.peek(s -> System.out.print(s + " ")).count();
		System.out.println();

		System.out.println("Liczba wyraz�w na 's': " + countSWords);
		System.out.println("Liczba wyraz�w z 5 literami: " + fiveLetters);

		br.close();
	}
}