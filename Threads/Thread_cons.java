package Threads;

class first_thread extends Thread{
	
	/* 
	 * What's cool with threads? The class "Thread" has its own methods like getName, getThreadGroup, activeCount
	 * it would be very useful in case we have to organize the workload.
	 */
	
	first_thread(String name){
		super(name);
	}

	@Override
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.printf("Thread -> %s Index -> %d ThreadGroup -> %b\n", getName(),i,getThreadGroup());
			try {
				//This sleep method is executed by milliseconds
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class Thread_cons {
	public static void main(String [] args) {
		first_thread sample = new first_thread("Hey guys!");
		sample.start();
	}
}
