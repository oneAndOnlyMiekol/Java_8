
public class CalcTest {

	public static void main(String[] args) {
		int a=34;
		int b=12;
		int c=4;
		double aa=34.55;
		double bb=12.11;
		double cc=4.78;
		Calculator calc = new Calculator();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(calc.add(a, b));
		System.out.println(calc.add(a, b, c));
		System.out.println(calc.subtract(a, b));
		System.out.println(calc.subtract(a, b, c));
		System.out.println(calc.add(aa, bb));
		System.out.println(calc.add(aa, bb, cc));
		System.out.println(calc.subtract(aa, bb));
		System.out.println(calc.subtract(aa, bb, cc));
	}

}
