package excercice;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamTester {

	public static void main(String[] args) {
		Stream<Integer> streamOfInt = Stream.iterate(0, x->x+1);
		List<Integer> listOfInt = streamOfInt.filter(x->(x>100&&x<1000&&x%5==0)).limit(10).collect(Collectors.toCollection(ArrayList::new));
		listOfInt.forEach(r->System.out.print(r*3 + ", "));
	}

}
