package data;

public class Rectangle implements Shape {

	private double a;
	private double b;
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public Rectangle(double a, double b) {
		this.setA(a);
		this.setB(b);
	}

	@Override public double calculateArea() {
		return getA()*getB();
	}

	@Override
	public double calculatePerimeter() {
		return 2*getA()+2*getB();
	}
	
	@Override
	public String toString() {
		return "Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
	}

}
