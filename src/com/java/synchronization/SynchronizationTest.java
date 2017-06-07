package com.java.synchronization;

public class SynchronizationTest {

	public static void main(String[] args) {

		final Job job = new Job();

		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		t1.start();
		t2.start();
	}

}

class Job implements Runnable {

	private static Object lockObj = new Object();

	void print(int number) {
		synchronized (lockObj) {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "-->" + number * i);
				try {
					lockObj.wait(1000);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	@Override
	public void run() {
		print(10);
	}
}