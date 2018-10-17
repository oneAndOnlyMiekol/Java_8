package excercice;

public class App {
	public static void main(String[] args) {
		
		Pair<Integer, Double> pair1 = new Pair<Integer, Double>(123, 22.2);
		Pair<String, Integer> pair2 = new Pair<String, Integer>("Abba", 333);
		Pair<String, String> pair3 = new Pair<String, String>("ONE", "TWO");
		
		System.out.println(pair1);
		System.out.println(pair2);
		System.out.println(pair3);
	}

}
