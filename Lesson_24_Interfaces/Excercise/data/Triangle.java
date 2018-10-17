package data;

public class Triangle implements Shape {

	private double a;
	private double b;
	private double c;
	private double h;
	
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

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	public Triangle(double a, double b, double c, double h) {
		this.setA(a);
		this.setB(b);
		this.setC(c);
		this.setH(h);
	}
	@Override 
	public double calculateArea() {
		return (getA()*getH())/2;
	}

	@Override
	public double calculatePerimeter() {
		return getA()+getB()+getC();
	}
	
	@Override
	public String toString() {
		return "Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
	}

}
