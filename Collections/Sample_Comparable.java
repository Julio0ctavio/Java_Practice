package Collections;
import java.util.TreeSet;

//What happens if I want to order objects like dogs?
class dog implements Comparable<dog>{
	
	private String name;
	
	@Override
	public String toString() {
		//Re-writing the output of this object:
		return "dog [name=" + this.name + "]";
	}

	dog(String name){
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//This method will compare the name of the "dog" object:
	@Override
	public int compareTo(dog o) {
		return name.compareTo(o.name);
	}
	
	
	
}

public class Sample_Comparable {
	public static void main(String [] args) {
		TreeSet<dog> names = new TreeSet<>();
		names.add(new dog("Luna Bella"));
		names.add(new dog("Maya"));
		names.add(new dog("Candy"));
		names.add(new dog("Candy"));
		System.out.println(names);
		
	}

}
