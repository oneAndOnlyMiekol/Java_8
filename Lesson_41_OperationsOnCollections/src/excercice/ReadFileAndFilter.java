package excercice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class ReadFileAndFilter {

	public static void main(String[] args) {
		String fileName = "lorem ipsum.txt";
		List<String> listOfLinesFromFile = new ArrayList<>();
		List<String> listOfWordsFromFile = new ArrayList<>();
		long howManyFiveLetterWords=0;
		long howManyWordsWithSOnTheBeginning=0;
		try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr);) {
			listOfLinesFromFile=br.lines().collect(Collectors.toList());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		listOfLinesFromFile.forEach(x -> listOfWordsFromFile.addAll(Arrays.asList(x.split(" "))));
		howManyFiveLetterWords=listOfWordsFromFile.stream().map(x->x.replace(",", "")).map(x->x.replace(".", "")).filter(x->x.length()==5).count();	
		
		System.out.println("Number of 5-letter words: " + howManyFiveLetterWords);
		howManyWordsWithSOnTheBeginning=listOfWordsFromFile.stream().map(x->x.replace(",", "")).map(x->x.replace(".", "")).filter(s -> !s.isEmpty()).filter(x->x.charAt(0)=='s'||x.charAt(0)=='S').count();
		System.out.println("Number of words with 's' as a first character: " + howManyWordsWithSOnTheBeginning);
		//listOfWordsFromFile.forEach(System.out::print);
		//System.out.println();
		//listOfLinesFromFile.forEach(x->System.out.print(x + " "));
	}


}
