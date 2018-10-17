package data;

public class Apple extends Fruit {
	
	private String variety;
	
	

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}
	
	public Apple(String variety) {
		setVariety(variety);
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(getVariety());
	}

}