package com.java.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueImplExample {

	public static void main(String[] args) {

		Queue<Customer> strQueue = new PriorityQueue<Customer>(5, idComparator);
		BlockingQueue<Customer> custBlockingQueue = new LinkedBlockingQueue<Customer>();
		
		strQueue.add(new Customer(7, "MS Dhoni"));
		strQueue.add(new Customer(1, "Shikar Dhawan"));
		strQueue.add(new Customer(4, "Suresh Raina"));
		strQueue.add(new Customer(3, "Virat Kohli"));
		strQueue.add(new Customer(2, "Rohit Sharma"));
		
		custBlockingQueue.add(new Customer(7, "MS Dhoni"));
		custBlockingQueue.add(new Customer(1, "Shikar Dhawan"));
		custBlockingQueue.add(new Customer(4, "Suresh Raina"));
		custBlockingQueue.add(new Customer(3, "Virat Kohli"));
		custBlockingQueue.add(new Customer(2, "Rohit Sharma"));
		
		System.out.println("strQueue size is " + strQueue.size());
		
		Customer custObj = null;
		while (true)
		{
			custObj = strQueue.poll();
			if (custObj == null)
			{
				break;
			}
			System.out.println(custObj.getId());
		}
	}

	// Comparator anonymous class implementation
	public static Comparator<Customer> idComparator = new Comparator<Customer>() {
		@Override
		public int compare(Customer c1, Customer c2) {
			return (int) (c2.getId() - c1.getId());
		}
	};
}
