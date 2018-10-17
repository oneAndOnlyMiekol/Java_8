package logic;

public class Logic {
	final static private String SUM = "+";
	final static private String SUBTRACT = "-";
	final static private String DIVIDE = "/";
	final static private String MULTIPLY = "*";

	public double Calculate(double a, double b, String choise) {
		double result = 0;
		switch (choise) {
		case SUM:
			result=a+b;
			break;
		case SUBTRACT:
			result=a-b;
			break;
		case DIVIDE:
			result=a/b;
			break;
		case MULTIPLY:
			result=a*b;
			break;
		default:
			System.out.println("Wybrano niepoprawne dzia³anie!");
			break;
		}

		return result;
	}

}
