package one;

import java.util.List;

public class ArrTest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 10, 15);
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}