package lesson;

import java.time.LocalTime;

public class TimeTest2 {
	public static void main(String[] args) throws InterruptedException  {
		LocalTime now = LocalTime.now();
		
		for(int i=0; i<10; i++) {
			System.out.println(now);
			now = LocalTime.now();
			Thread.sleep(1000);
		}
	}
}