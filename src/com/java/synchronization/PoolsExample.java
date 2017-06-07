package com.java.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class PoolsExample {
	
	static ExecutorService service = null;
	
	public static void main(String[] args) {
		service = Executors.newFixedThreadPool(5, new ThreadFactory() {
			private int	tCount	= 0;
			@Override
			public Thread newThread(Runnable r) {
				tCount++;
				Thread t = new Thread(r, "Thread-("+tCount+")") {
					public void run() {
						super.run();
					};
				};
				return t;
			}
		});
		for (int i = 0; i < 100; i++)
		{
			service.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName() + " is doing task no");
				}
			});
		}
			
	}
}