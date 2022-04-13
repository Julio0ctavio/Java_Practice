package Exceptions;

/*
 * In this section, we could perform a try block with resources making sure about any behavior or action that must be executed. 
 */
class army implements AutoCloseable{
	
	void toMarch() {
		System.out.println("Marching trops!");
	}

	@Override
	public void close() {
		System.out.println("Releasing resources...");
		
	}
	
}

public class Sample_TryResources {
	public static void main(String [] args) {
		try(army julio_army = new army()){
			julio_army.toMarch();
		}
	}
}
