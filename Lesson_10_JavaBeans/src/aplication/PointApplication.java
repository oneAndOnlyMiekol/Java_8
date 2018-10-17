package aplication;

import data.Point;
import control.PointController;

public class PointApplication {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(7, -14);
		PointController pointController = new PointController();
		p1.setxCoorodinate(4);
		p1.setyCoorodinate(-6);

		System.out.println("P1 - " + p1.getxCoorodinate() + ", " + p1.getyCoorodinate());
		System.out.println("P1 X+2 Y-3");
		pointController.addX(p1);
		pointController.addX(p1);
		pointController.minusY(p1);
		pointController.minusY(p1);
		pointController.minusY(p1);
		System.out.println("P1 - " + p1.getxCoorodinate() + ", " + p1.getyCoorodinate());

		System.out.println("P2 - " + p2.getxCoorodinate() + ", " + p2.getyCoorodinate());
		System.out.println("P2 X-2 Y+3");
		pointController.minusX(p2);
		pointController.minusX(p2);
		pointController.addY(p2);
		pointController.addY(p2);
		pointController.addY(p2);
		System.out.println("P2 - " + p2.getxCoorodinate() + ", " + p2.getyCoorodinate());

	}

}
