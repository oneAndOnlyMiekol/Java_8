package one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excercice {

	public static void main(String[] args) {

		ArrayList<Integer> integerList = new ArrayList<>();
		addNext(integerList);
		printList(integerList);

	}

	public static ArrayList<Integer> addNext(ArrayList<Integer> arrayList) {
		Scanner input = new Scanner(System.in);
		String stringFromUser;
		boolean readComplete = false;
		while (!readComplete) {
			try {
				System.out.print("Add number: ");
				stringFromUser = input.nextLine();
				if (stringFromUser.equals("exit")) {
					System.out.println("out");
					return arrayList;
				} else {

					Integer intFromUser = Integer.valueOf(stringFromUser);
					arrayList.add(intFromUser);
					addNext(arrayList);

				}

				readComplete = true;
			} catch (NumberFormatException e) {
				System.out.println("I was right what exeption will be generated");
				e.getStackTrace();
			}
		}
		input.close();

		return arrayList;
	}

	static void printList(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			if(i<(list.size()-1)) {
				System.out.print(list.get(i) + "+");
			} else {
				System.out.print(list.get(i) + "=" + Excercice.sumList(list));
			}
			
		}
		

	}
	
	static int sumList(List<Integer> list) {
		int sum=0;
		for(Integer tempList:list) {
			sum+=tempList;
		}
		return sum;
	}

}
