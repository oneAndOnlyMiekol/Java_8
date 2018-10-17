package lesson;

import java.time.Duration;
import java.time.Instant;

public class TimeTest {
	public static void main(String[] args) {
		Instant i1 = Instant.now();
		for(int i=0; i<11; i++) {
			System.out.println("Miernik czasu");
		}
		Instant i2 = Instant.now();
		Duration duration = Duration.between(i1, i2);
		System.out.println("Up³ynê³o : " + duration.getNano() + " nanosekund");
	}
}