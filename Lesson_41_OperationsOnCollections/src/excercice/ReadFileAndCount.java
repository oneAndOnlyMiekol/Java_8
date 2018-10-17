package excercice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;


public class ReadFileAndCount {

	public static void main(String[] args) {
		String fileName = "lorem ipsum.txt";
		List<String> listOfLinesFromFile = new ArrayList<>();
		List<String> listOfWordsFromFile = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
			listOfLinesFromFile = br.lines().collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		listOfLinesFromFile.forEach(x -> listOfWordsFromFile.addAll(Arrays.asList(x.split(" "))));
		
		//listOfWordsFromFile=listOfWordsFromFile.stream().map(ReadFileAndCount::replace).collect(Collectors.toList());
		
		//Supplier<Stream<String>> wordsFromFileStream = () -> listOfWordsFromFile.stream().map(ReadFileAndCount::replace);
		
		long howManyFiveLetterWords = listOfWordsFromFile.stream().map(ReadFileAndCount::replace)
				.filter(x -> x.length() == 5).count();
		System.out.println("Number of 5-letter words: " + howManyFiveLetterWords);

		long howManyWordsWithSOnTheBeginning = listOfWordsFromFile.stream().map(ReadFileAndCount::replace)
				.filter(s -> !s.isEmpty()).filter(x -> x.charAt(0) == 's').count();
		System.out.println("Number of words with 's' as a first character: " + howManyWordsWithSOnTheBeginning);

	}

	public static String replace(String wordToChange) {
		String changedWord = wordToChange.replace(",", "").replace(".", "");
		return changedWord;
	}

}
