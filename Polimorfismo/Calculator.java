package Polimorfismo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Calculator {
	
	public static void main(String[] args) throws IOException{
		int option;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Select the figure you want to calculate its area..."
				+ "\n1.Circule\n2.Poligon\n3.Triangule\n\n");
		option = Integer.parseInt(br.readLine());
		switch(option) {
			case 1:
				circule cir = new circule("Red", 34.55f);
				cir.Area();
				break;
			case 2:
				poligon pol = new poligon("Orange", 5, 4);
				pol.Area();
				break;
			case 3:
				triangule irreg = new triangule("Yellow");
				irreg.area_triangule_2(34, 12.65f, 16.45f);
				break;
			default:
				System.out.println("Default");
				break;
		}
		
	}
	
}
