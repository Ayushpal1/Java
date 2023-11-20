package DemoCode2;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String ags[]) {
		
		Thread task = new PrimeGenerator();
		task.start();
		
		try {
			TimeUnit.SECONDS.sleep(5);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		task.interrupt();
		
		System.out.printf("Main: Status of the Thread: %s\n", task.getState());
		System.out.printf("Main: isInturrupted: %s\n", task.isInterrupted());
		System.out.printf("Main: isAlive: %s\n", task.isAlive());
	}
}
