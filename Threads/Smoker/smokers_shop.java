package Threads.Smoker;

public class smokers_shop {
	public static void main(String [] args) throws InterruptedException {

		// Instantiating the objects...
		cigarette res = new cigarette();
		smoker con1 = new smoker(res, "Julio Lozano");
		smoker con2 = new smoker(res, "Mark Thompson");
		smoker con3 = new smoker(res, "Pradeep Mangar");
		producer pro1 = new producer(res, "Russell Van S.");
		producer pro2 = new producer(res, "Jim Burton.");

		//The magic begins!
		con1.start();
		pro1.start();
		pro2.start();
		con2.start();
		con3.start();
	}
}
