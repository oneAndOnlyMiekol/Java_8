import java.util.Random;

public class Exercise {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int x;
		int y;
		boolean result;
		x=rand.nextInt(10);
		y=rand.nextInt(10);
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		result=x>y;
		System.out.println("x>y = " + result);
		result=(x*2)>y;
		System.out.println("x*2>y = " + result);
		result=(y<(x+3))&&(y>(x-2));
		System.out.println("y<x+3 && y>x-2 = " + result);
		result=(((x*y)%2==0))&&(x!=0)&&(y!=0);
		System.out.println("(x*y)%2==0 = " + result);

	}

}
