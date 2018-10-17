package data;

import java.util.NoSuchElementException;

public enum Option {
	EXIT_PROGRAM(0, " - Exit program"), 
	READ_FROM_USER(1, " - Read employee data from user"), 
	READ_FROM_FILE(2, " - Read employee data from file"),
	PRINT_FROM_FILE(3, " - Print employee data from file"),
	WRITE_WHOLE_FILE_RANDOM(4, " - Create rest of employees random"),
	WRITE_NEW_RANDOM_EMPLOYEE(5, " - Create new random employee");
	
	private int option;
	private String description;
	
	public int getOption() {
		return option;
	}

	private void setOption(int option) {
		this.option = option;
	}
	
	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	private Option(int opiton, String description) {
		this.setOption(opiton);
		this.setDescription(description);
	}
	
	public static Option optionFromInt(int option) throws NoSuchElementException{
		Option result=null;
		try {
			result=Option.values()[option];
		}catch (ArrayIndexOutOfBoundsException e) {
			throw new NoSuchElementException("\nEntered value is invalid!\n");
		}
		return result;
	}
	
	@Override
	public String toString() {
		return getOption() + getDescription();
	}
	 

}
