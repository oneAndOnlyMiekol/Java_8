
public class MatematicOperators {

	public static void main(String[] args) {
		int x = 10;
		int y = 4;
		int sum = x + y;
		int sub = x - y;
		int multi = x * y;
		double div = (double)x / y;
		int mod = x % y;
		
		System.out.println(x + "+" + y + "=" + sum);
		System.out.println(x + "-" + y + "=" + sub);
		System.out.println(x + "*" + y + "=" + multi);
		System.out.println(x + "/" + y + "=" + div);
		System.out.println(x + "%" + y + "=" + mod);
		
		
		System.out.println(x + "+" + 4 + "=" + (x+=4));
		System.out.println(x + "-" + 4 + "=" + (x-=4));
		System.out.println(x + "*" + 4 + "=" + (x*=4));
		System.out.println(x + "/" + 4 + "=" + (x/=4));
		System.out.println(x + "%" + 4 + "=" + (x%=4));
		
		System.out.print("Czy X jest wiêkszy od Y? ");
		System.out.println(x > y);
		
		System.out.print("Czy X jest ró¿ny od Y? ");
		System.out.println(x != y);
		
		boolean instance = "Kasia" instanceof java.lang.String;
		System.out.println(instance); //"Kasia" jest typu String
		
	}

}
