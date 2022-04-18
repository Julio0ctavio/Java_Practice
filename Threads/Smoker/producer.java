package Threads.Smoker;

import java.util.Random;

public class producer extends Thread{
	private cigarette res;
	
	producer(cigarette res, String name){
		super(name);
		this.res = res;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int value = (new Random().nextInt(3)) + 1;
				switch(value) {
				case 1:
					System.out.printf("%s is supplying Tobacco \n",getName());
					res.produce_tobaco();
					break;
				case 2:
					System.out.printf("%s is supplying Paper \n",getName());
					res.produce_paper();
					break;
				case 3:
					System.out.printf("%s is supplying Matches \n",getName());
					res.produce_matches();
					break;
				default:
					break;
				}
				res.produce_cigarette();
				Thread.sleep(new Random().nextInt(400));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
