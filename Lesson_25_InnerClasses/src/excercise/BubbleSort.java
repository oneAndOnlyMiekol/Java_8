package excercise;

public class BubbleSort {

	public static void main(String[] args) {
		
		Sortable sorter = new Sortable() {
			
			@Override
			public void sort(double[] arrayToSort) {
				double temp;
				for(int i=0;i<arrayToSort.length-1;i++) {
					for(int j=0;j<arrayToSort.length-1-i;j++) {
						if(arrayToSort[j]>arrayToSort[j+1]) {
							temp=arrayToSort[j];
							arrayToSort[j]=arrayToSort[j+1];
							arrayToSort[j+1]=temp;
						}
						
							
					}
					for(int j=0;j<arrayToSort.length;j++) {
						System.out.print(" " + arrayToSort[j]);
					}
					System.out.println();
					
				}
				//return arrayToSort;
				
			}
		};
		
		double[] arrayOfDouble = {333333.0, 3.0, 7.2, 99.3, 92.2, 11111.2, 324.3, 856.8, 8573.9, 342.3, 1.0};
		
		for(int i=0; i<arrayOfDouble.length; i++) {
			System.out.print(" " + arrayOfDouble[i]);
		}
		System.out.println();
		
		//double[] testArray=sorter.sort(arrayOfDouble);
		sorter.sort(arrayOfDouble);
		for(int i=0; i<arrayOfDouble.length; i++) {
			System.out.print(" " + arrayOfDouble[i]);
		}
		System.out.println();
		//for(int i=0; i<testArray.length; i++) {
		//	System.out.print(" " + testArray[i]);
		//}
		
	}

}
