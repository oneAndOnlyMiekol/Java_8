package excercice;

import java.util.List;

public class LottoTester {

	public static void main(String[] args) {
		
		Lotto machine = new Lotto();
		List<Integer> numbers = List.of(3,21,28,34,35,39);
		machine.randomize();
		machine.print();
		machine.generate();
		machine.print();
		machine.randomize();
		machine.print();
		machine.checkResult(numbers);

	}

}
