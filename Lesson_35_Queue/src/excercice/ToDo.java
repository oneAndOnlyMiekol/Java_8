package excercice;


//import java.util.Comparator;
import java.util.InputMismatchException;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import excercice.Task.Priority;



public class ToDo {
	public static final int ADD = 1;
	public static final int PRINT = 2;
	public static final int PRINT_ALL_TASKS = 3;
	public static final int NEXT_TASK=4;
	public static final int EXIT = 0;
	
	
	
	public static void main(String[] args) {

		PriorityQueue<Task> toDoList = new PriorityQueue<>();
		try (Scanner input = new Scanner(System.in);) {
			int choise = 0;
			do {
				printOptions();
				try {
					switch (choise = Integer.parseInt(input.nextLine())) {
					case ADD:
						addTask(input, toDoList);
						break;
					case PRINT:
						printTask(toDoList);
						break;
					case PRINT_ALL_TASKS:
						printAllTask(toDoList);
						break;
					case EXIT:

						break;
					case NEXT_TASK:
						nextTask(toDoList);
						printTask(toDoList);
						break;
					default:
						System.out.println("Invalid value!");
						break;
					}
				} catch (InputMismatchException | IllegalArgumentException e) {
					System.out.println("Invalid value!");
				}
			} while (choise != EXIT);
		}

	}

	private static void nextTask(Queue<Task> toDoList) {
		toDoList.poll();
		
		
	}

	public static void printOptions() {
		System.out.println("1 - Add");
		System.out.println("2 - Print");
		System.out.println("3 - Print all tasks");
		System.out.println("4 - Next task");
		System.out.println("0 - Exit");
		System.out.print("Enter the value: ");
	}

	public static void printTask(PriorityQueue<Task> toDoList) {
		System.out.println(toDoList.peek().toString());

	}
	
	public static void printAllTask(PriorityQueue<Task> toDoList) {
		for(Task task:toDoList) {
			System.out.println(task);
		}

	}

	public static boolean addTask(Scanner input, PriorityQueue<Task> toDoList) {
		System.out.print("Enter name of the task: ");
		String name=input.nextLine();
		System.out.print("Enter description of the task(optional)");
		String description=input.nextLine();
		System.out.println("Set priority: ");
		Priority priority=Priority.valueOf(input.nextLine());
		if(toDoList.add(new Task(name, description, priority))) {
			return true;
		}
			
		return false;

	}

}
