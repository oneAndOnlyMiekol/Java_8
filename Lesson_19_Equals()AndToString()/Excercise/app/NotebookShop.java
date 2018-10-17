package app;

import data.Computer;
import data.DataStore;

public class NotebookShop {

	public static void main(String[] args) {
		DataStore dataStore = new DataStore();
		
		dataStore.add(new Computer("ASUS", 5600));
		dataStore.add(new Computer("ASUS", 4000));
		dataStore.add(new Computer("DELL", 5600));
		dataStore.add(new Computer("HP", 5600));
		dataStore.add(new Computer("ASUS", 5600));
		dataStore.add(new Computer("LENOVO", 5600));
		
		Computer computer = new Computer("ASUS",  5600);
		
		System.out.println("Number of " + computer + " in storage is " + dataStore.checkAvailability(computer));
		
		dataStore.printListOfComputersInStorage();

	}

}
