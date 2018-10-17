package utils;

import java.util.Scanner;

import data.Circle;
import data.Rectangle;
import data.Triangle;

public class ShapeCreator {
	
	
	Scanner input;
	
	public ShapeCreator() {
		input = new Scanner(System.in);
	}
	
	public Triangle createTriangle() {
		System.out.print("Enter lenght of the side A of the triangle: ");
		double a=input.nextDouble();
		input.nextLine();
		System.out.print("Enter lenght of the side B of the triangle: ");
		double b=input.nextDouble();
		input.nextLine();
		System.out.print("Enter lenght of the side C of the triangle: ");
		double c=input.nextDouble();
		input.nextLine();
		System.out.print("Enter height of triangle from side A: ");
		double h=input.nextDouble();
		input.nextLine();
		return new Triangle(a, b, c, h);
	}
	
	public Rectangle createRectangle() {
		System.out.print("Enter lenght of the side A of the rectangle: ");
		double a=input.nextDouble();
		input.nextLine();
		System.out.print("Enter lenght of the side B of the rectangle: ");
		double b=input.nextDouble();
		input.nextLine();
		return new Rectangle(a, b);
	}
	
	public Circle createCircle() {
		System.out.print("Enter radius of the circle: ");
		double r=input.nextDouble();
		input.nextLine();
		return new Circle(r);
	}
	public void close() {
		input.close();
	}

}
