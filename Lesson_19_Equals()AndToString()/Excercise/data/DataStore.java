package data;



public class DataStore {
	
	public final static int MAX_COMPUTER_STORAGE_CAPASITY=100;
	
	private Computer[] computerStorage;
	private int numberOfComputersInStorage=0;
	
	
	public DataStore() {
		computerStorage = new Computer[100];
		
	}
	
	public void add(Computer computer) {
		computerStorage[numberOfComputersInStorage]=computer;
		numberOfComputersInStorage++;
	}
	
	public int checkAvailability(Computer computer) {
		int numberOfCopies=0;
		for(int i=0; i<numberOfComputersInStorage; i++) {
			if(computer.equals(computerStorage[i])) {
				numberOfCopies++;
			}
		}
		return numberOfCopies;
	}
	
	public void printListOfComputersInStorage() {
		for(int i=0; i<numberOfComputersInStorage; i++) {
			System.out.println(computerStorage[i]);
		}
	}

}
