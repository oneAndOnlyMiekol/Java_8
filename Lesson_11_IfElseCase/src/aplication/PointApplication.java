package aplication;

import data.Point;
import control.PointController;

public class PointApplication {

	public static final int ADD_X = 1;
	public static final int ADD_Y = 2;
	public static final int MINUS_X = 3;
	public static final int MINUS_Y = 4;

	public static void main(String[] args) {
		int choise = 3;
		Point p2 = new Point(7, -14);
		PointController pointController = new PointController();
		
		System.out.println("P2 - " + p2.getxCoorodinate() + ", " + p2.getyCoorodinate());

		
		switch (choise) {
		case ADD_X:
			pointController.addX(p2);
			break;
		case ADD_Y:
			pointController.addY(p2);
			break;
		case MINUS_X:
			pointController.minusX(p2);
			break;
		case MINUS_Y:
			pointController.minusY(p2);
			break;

		default:
			break;
		}

		
		System.out.println("P2 - " + p2.getxCoorodinate() + ", " + p2.getyCoorodinate());

	}

}
