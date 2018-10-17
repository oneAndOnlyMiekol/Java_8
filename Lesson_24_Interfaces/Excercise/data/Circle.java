package data;

public class Circle implements Shape{

	private double r;
	
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public Circle(double r) {
		this.setR(r);
	}

	@Override
	public double calculateArea() {
		return Shape.PI*getR()*getR();
	}

	@Override
	public double calculatePerimeter() {
		return Shape.PI*2*getR();
	}

	@Override
	public String toString() {
		return "Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
	}
	
	

}
