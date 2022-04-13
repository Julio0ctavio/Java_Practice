package Threads;

class SyncCounter {
	static int counter = 11;
	// You need to synchronize the counter because more than threads call this function to do something.
	public synchronized static void decrement() {
		counter--;
		System.out.println(counter);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class Decrementor extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Decrementing...SyncCounter");
		SyncCounter.decrement();
	}
	
}


public class Synchro {
	public static void main(String[] args) {
		for (int i=0; i<12;i++) {
			new Decrementor().start();
		}
	}
}
