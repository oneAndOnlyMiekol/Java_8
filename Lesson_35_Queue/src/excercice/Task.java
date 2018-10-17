package excercice;

public class Task implements Comparable<Task>{
	private String name;
	private String description;
	private Priority priority;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Task(String name, String description, Priority priority) {
		super();
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	public enum Priority {
		LOW(3), MODERATE(2), HIGH(1);

		private int priority;

		public int getPriority() {
			return priority;
		}

		private void setPriority(int priority) {
			this.priority = priority;
		}

		Priority(int priority) {
			setPriority(priority);
		}
		
		@Override
		public String toString() {
			return name();
		}
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + "\nDescription: " + getDescription() + "\nPriority: " + getPriority();
	}
	@Override
	public int compareTo(Task arg0) {
		if(getPriority().getPriority()<arg0.getPriority().getPriority())
			return -1;
		if(getPriority().getPriority()>arg0.getPriority().getPriority())
			return 1;
		return 0;
	}

}
