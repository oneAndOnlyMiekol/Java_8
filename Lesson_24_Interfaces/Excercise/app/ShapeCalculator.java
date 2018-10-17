package app;

import java.util.Scanner;

import data.Circle;
import data.Rectangle;
import data.Triangle;
import utils.ShapeCreator;

public class ShapeCalculator {

	public final static int CIRCLE = 1;
	public final static int RECTANGLE = 2;
	public final static int TRIANGLE = 3;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ShapeCreator shapeCreator= new ShapeCreator();
		Circle circle;
		Triangle triangle;
		Rectangle rectangle;

		System.out.println("This program calculates area and perimeter of certain shapes:");
		System.out.println(CIRCLE + " - Circle");
		System.out.println(RECTANGLE + " - Rectangle");
		System.out.println(TRIANGLE + " - Triangle");
		System.out.print("Enter number of specific shape: ");
		int option = input.nextInt();
		input.nextLine();
		switch (option) {
		case CIRCLE:
			circle=shapeCreator.createCircle();
			System.out.println(circle);
			break;
		case TRIANGLE:
			triangle=shapeCreator.createTriangle();
			System.out.println(triangle);
			break;
		case RECTANGLE:
			rectangle=shapeCreator.createRectangle();
			System.out.println(rectangle);
			break;
		}
		shapeCreator.close();
		input.close();
	}

}
