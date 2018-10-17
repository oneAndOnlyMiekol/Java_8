
public class Calculate {

	public static void main(String[] args) {
		Calculator result = new Calculator();
		double a = 10.2;
		double b = 7.3;

		System.out.println(a + "+" + b + "=" + result.add(a, b));
		System.out.println(a + "-" + b + "=" + result.subtract(a, b));
		System.out.println(a + "*" + b + "=" + result.multiply(a, b));
		System.out.println(a + "/" + b + "=" + result.divide(a, b));
		System.out.println(a + "%" + b + "=" + result.modulo((int) a, (int) b));

	}

}
