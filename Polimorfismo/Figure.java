package Polimorfismo;

public abstract class Figure {
	
	private String color, name;
	
	Figure(String color){
		setColor(color);
	}
	
	public final String getColor() {
		return color;
	}


	public final void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}
