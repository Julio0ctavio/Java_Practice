package Threads.Prod_Cons;

import java.util.Random;

public class consumer extends Thread{
	
	private resource res;
	
	consumer(resource res, String name){
		super(name);
		this.res = res;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int value = res.consume();
				System.out.printf("%s has consumed %d \n",getName(), value);
				Thread.sleep(new Random().nextInt(250));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
