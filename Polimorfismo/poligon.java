package Polimorfismo;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class poligon extends Figure implements Dimensions{
	
	private int sides, apothem;
	
	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public int getApothem() {
		return apothem;
	}

	public void setApothem(int apothem) {
		this.apothem = apothem;
	}

	public poligon(String color, int sides, int apothem) {
		// Obviously its has inheritance by figure
		super(color);
		setSides(sides);
		setApothem(apothem);
	}
	
	@Override
	public void Area() throws NumberFormatException, IOException{
		String regular;
		float measure=0f;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Your poligon is regular? Y/N y/n");
		regular = br.readLine();
		if (regular.equals("Y") || regular.equals("y")) {
			if (sides > 4){
				System.out.println("Type the measure: ");
				measure = Float.parseFloat(br.readLine());
				double perimeter = sides * measure;
				System.out.println(String.format("The area of your poligon is %,.2f",(perimeter * apothem) / 2));
			}else if(sides == 4) {
				System.out.println(String.format("Your figure is a square! Your area is %,.2f",measure*measure));
			}else {
				System.out.println("Use the triangule class instead...");
			}
		}
		else {
			System.out.println("We can't perform that calculus in this program...");
		}
	}

	@Override
	public void Perimeter() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float measure=0f;
		if (sides == 4){
			System.out.println("Type the measure: ");
			System.out.println(String.format("Your figure is a square! Your perimeter is %,.2f",measure*4));
		}else {
			System.out.println("Type the measure: ");
			measure = Float.parseFloat(br.readLine());
			System.out.println(String.format("The perimeter of your poligon is %,.2f",sides*measure));
		}
		
	}

}
