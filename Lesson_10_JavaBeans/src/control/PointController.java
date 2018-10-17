package control;

import data.Point;

public class PointController {

	public Point addX(Point point) {
		point.setxCoorodinate(point.getxCoorodinate() + 1);
		return point;
	}

	public Point addY(Point point) {
		point.setyCoorodinate(point.getyCoorodinate() + 1);
		return point;
	}

	public Point minusX(Point point) {
		point.setxCoorodinate(point.getxCoorodinate() - 1);
		return point;
	}

	public Point minusY(Point point) {
		point.setyCoorodinate(point.getyCoorodinate() - 1);
		return point;
	}

}
