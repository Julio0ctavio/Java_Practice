package Threads.Prod_Cons;

import java.util.Random;

public class producer extends Thread{
	private resource res;
	
	producer(resource res, String name){
		super(name);
		this.res = res;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int value = new Random().nextInt(1000);
				System.out.printf("%s producing %d \n",getName(), value);
				res.produce(value);
				Thread.sleep(new Random().nextInt(300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
