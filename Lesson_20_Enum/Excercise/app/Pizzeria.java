package app;

import java.util.Scanner;

public class Pizzeria {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Availble pizzas: ");
		for(Pizza temp:Pizza.values()) {
			System.out.println(temp);
		}
		System.out.print("\nPlease take your order: ");
		String order=input.nextLine();
		
		for(Pizza temp:Pizza.values()) {
			if(order.equals(temp.name()))
				System.out.println(temp);
		}
		
		input.close();
	}

}
