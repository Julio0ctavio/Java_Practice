package Statics;

import java.io.IOException;

class Galaxy {
	
	static int total_planets=0;
	
	static float light_years=0f;
	
	Galaxy(){
		total_planets++;
		light_years = light_years + 2.573548f;
	}
}


public class First_example {
	
	int test_value = 0;
	
	public static void main(String [] args) throws IOException {
		System.out.println("In Andromeda galaxy has " + Galaxy.total_planets + " planets.\n");
		new Galaxy();
		new Galaxy();
		System.out.println("In Andromeda galaxy has " + Galaxy.total_planets + " planets. Now these planets are " 
		+ String.format("%,.2f",Galaxy.light_years) + " light years far away.");
	}

}
