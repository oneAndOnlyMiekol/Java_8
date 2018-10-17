package app;

public class Excercise {

	public static void main(String[] args) {
		double[][] multiTable = {{1.0,1.5,2.0},{1.5,2.0,2.5},{2.0,2.5,3.0}};
		double sum;
		double multiply;
		double sumOfConrners;
		
		sum=(multiTable[0][0]*multiTable[1][1]*multiTable[2][2])+(multiTable[0][2]*multiTable[1][1]*multiTable[2][0]);
		multiply=(multiTable[0][1]+multiTable[1][1]+multiTable[2][1])*(multiTable[1][0]+multiTable[1][1]+multiTable[1][2]);
		sumOfConrners=multiTable[0][0]+multiTable[0][1]+multiTable[0][2]+multiTable[1][0]+multiTable[1][2]+multiTable[2][0]+
					  multiTable[2][1]+multiTable[2][2];
		System.out.println(sum);
		System.out.println(multiply);
		System.out.println(sumOfConrners);

	}

}
