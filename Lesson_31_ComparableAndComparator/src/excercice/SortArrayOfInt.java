package excercice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortArrayOfInt {
	
	public static final int MAX_INT=20;
	
	public static void main(String[] args) {
		
		
		Integer[] arrayOfInt = new Integer[MAX_INT];
		
		SortArrayOfInt.createNewArray(arrayOfInt);
		SortArrayOfInt.printArray(arrayOfInt);
		
		Arrays.sort(arrayOfInt, new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg0.compareTo(arg1);
			}
		});
		
		SortArrayOfInt.printArray(arrayOfInt);
		SortArrayOfInt.createNewArray(arrayOfInt);
		SortArrayOfInt.printArray(arrayOfInt);
		
		Arrays.sort(arrayOfInt, new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg1.compareTo(arg0);
			}
		});
		
		SortArrayOfInt.printArray(arrayOfInt);
		
	}
	
	
	public static  void createNewArray(Integer[] array) {
		Random intGenerator = new Random();
		for(int i=0; i<MAX_INT;i++) {
			array[i]=intGenerator.nextInt(MAX_INT);
		}
	}
	
	public static <T> void printArray(T[] arr) {
		for(T t: arr) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
	
	

}
