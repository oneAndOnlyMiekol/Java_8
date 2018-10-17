
public class Excercice {

	public static void main(String[] args) {
		System.out.println(multiply(10));

	}
	
	public static int multiply(int n) {
		
		return n==1?n:multiply(n-1)*n;
	}

}
