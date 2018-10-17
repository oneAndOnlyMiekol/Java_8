package excercice;



public class Calculator {

	final static private String SUM = "+";
	final static private String SUBTRACT = "-";
	final static private String DIVIDE = "/";
	final static private String MULTIPLY = "*";

	public double Calculate(double a, double b, String choise) throws ArithmeticException, UnknownOperatorExeption {
		
		double result = 0;
		switch (choise) {
		case SUM:
			result=a+b;
			break;
		case SUBTRACT:
			result=a-b;
			break;
		case DIVIDE:
			if (b == 0)
				throw new ArithmeticException("You can't divibe by 0!");
			result=a/b;
			break;
		case MULTIPLY:
			result=a*b;
			break;
		default:
			throw new UnknownOperatorExeption("Given operator is invalid!");
			
		}

		return result;
	}
	
	
	
	

}
