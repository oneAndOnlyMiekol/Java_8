package data;

public class Point {

	private int xCoorodinate;
	private int yCoorodinate;

	public int getxCoorodinate() {
		return xCoorodinate;
	}

	public void setxCoorodinate(int xCoorodinate) {
		this.xCoorodinate = xCoorodinate;
	}

	public int getyCoorodinate() {
		return yCoorodinate;
	}

	public void setyCoorodinate(int yCoorodinate) {
		this.yCoorodinate = yCoorodinate;
	}

	public Point() {
	}

	public Point(int xCoordinate, int yCoordinate) {
		this.setxCoorodinate(xCoordinate);
		this.setyCoorodinate(yCoordinate);
	}

}
