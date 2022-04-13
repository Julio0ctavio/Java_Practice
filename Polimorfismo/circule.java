package Polimorfismo;


public class circule extends Figure implements Dimensions{
	// It has an inheritance by figure
	private float radio;

	public circule(String color, float radio) {
		super(color);
		this.radio = radio;
	}
	
	@Override
	public void Area() {
		System.out.println(String.format("The Area of your circule is %,.2f",Math.PI*Math.pow(radio, 2)));
	}

	@Override
	public void Perimeter() {
		System.out.println(String.format("The Perimeter of your circule is %,.2f", Math.PI*2*radio));		
	}
	
	

}
