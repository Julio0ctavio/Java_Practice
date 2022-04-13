package Threads.Prod_Cons;

public class shop {
	
	public static void main(String [] args) throws InterruptedException {
		
		// Instantiating the objects...
		resource res = new resource();
		consumer con1 = new consumer(res, "Julio Lozano");
		consumer con2 = new consumer(res, "Mark Thompson");
		consumer con3 = new consumer(res, "Pradeep Mangar");
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
