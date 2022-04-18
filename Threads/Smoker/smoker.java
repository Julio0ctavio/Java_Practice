package Threads.Smoker;

import java.util.Random;

public class smoker extends Thread {
private cigarette res;
	smoker(cigarette res, String name){
		super(name);
		this.res = res;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int value = res.consume();
				System.out.printf("%s has smoked the cigarette N° %d \n\n",getName(), value);
				Thread.sleep(new Random().nextInt(1500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
