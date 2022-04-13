package Threads;

class counter implements Runnable{
	
	private int value;
	
	counter(int value) {
		this.value = value;
	}
	
	@Override
	public void run() {
		System.out.printf("Regresive count begins...\n\n");
		for (int i=value; i> 0; i--) {
			System.out.printf("Current thread: %s | %d\n", Thread.currentThread().getName(), i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class Thread_runnable {
	public static void main(String [] args) throws InterruptedException {
		Thread sample = new Thread(new counter(30), "Magic Thread");
		sample.start();
		//Once we have concluded the execution of the thread "sample"
		sample.join();
		System.out.printf("\nThe thread execution has finished\n");
	}
}
