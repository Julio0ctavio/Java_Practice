package Threads.Smoker;

import java.util.LinkedList;
import java.util.Random;

public class cigarette {
	// That's our main list resources:
	private LinkedList<Integer> cigarettes = new LinkedList<>();
	
	//Each material for those cigarettes
	private boolean paper, tobacco, matches;
		
	public synchronized int consume() throws InterruptedException {
		while(cigarettes.size() == 0) {
			wait();
		}
		return cigarettes.poll();
	}
	
	public synchronized void produce_tobaco() {
		tobacco = true;
	}
	
	public synchronized void produce_paper() {
		paper = true;
	}
	
	public synchronized void produce_matches() {
		matches = true;
	}
	
	public synchronized void produce_cigarette() throws InterruptedException {
		if ((paper && tobacco && matches) == true) {
			//If we have all mats, we can produce one cigarette.
			int value = new Random().nextInt(1000);
			//Switching back the mats for each cigarette
			paper = false;
			tobacco = false;
			matches = false;
			System.out.printf("\n\nCigarette N° %d available...\n", value);
			cigarettes.offer(value);
			// Causes the current thread to wait until it is awakened.
			notifyAll();
		}
	}
}
