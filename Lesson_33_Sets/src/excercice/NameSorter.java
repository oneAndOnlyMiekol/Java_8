package excercice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

public class NameSorter {

	public static final String FILE_NAME = "namespl.txt";

	public static void main(String[] args) {

		HashSet<Name> nameSet = new HashSet<>();
		LinkedList<Name> sortedNameSet = new LinkedList<>();
		//boolean isReadFinished=false;
		
		try (FileReader fr = new FileReader(FILE_NAME); 
			 BufferedReader br = new BufferedReader(fr);) {
				readFile(br, nameSet);
				

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		sortedNameSet.addAll(nameSet);
		sortedNameSet.sort(new Comparator<Name>() {

			@Override
			public int compare(Name arg0, Name arg1) {
				return -arg0.compareTo(arg1);
			}

			
			
		});
		printArray(sortedNameSet);
		
	}
	
	public static void readFile(BufferedReader br, HashSet<Name> nameSet) throws IOException{
		if(br.readLine()==null) {
			return;
		} else {
			nameSet.add(new Name(br.readLine()));
			readFile(br, nameSet);
		}
	}
	
	//public static void 
	
	public static <T> void printArray(Collection<T> array) {
		StringBuilder result = new StringBuilder(32);
		for(T tempArray:array) {
			result.append(tempArray.toString());
			result.append("\n");
		}
		System.out.println(result.toString());
	}

}
