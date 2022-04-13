package Threads.Prod_Cons;

import java.util.LinkedList;

public class resource {
	// That's our main list resources:
	private LinkedList<Integer> resources = new LinkedList<>();
	
	
	public synchronized int consume() throws InterruptedException {
		while(resources.size() == 0) {
			wait();
		}
		return resources.poll();
	}
	
	public synchronized void produce(int value) {
		resources.offer(value);
		// Causes the current thread to wait until it is awakened.
		notifyAll();
	}
}
