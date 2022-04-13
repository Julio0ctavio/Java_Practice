package Collections;
import java.util.Comparator;
import java.util.TreeSet;

class medicine{
	
	private String name;
	private String classification;
	
	@Override
	public String toString() {
		return "Medicine -> [name:" + this.name + "]";
	}
	
	medicine(String name,String classification){
		setName(name);
		setClassification(classification);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

}

//if we trying to compare more parameters of "medicine", we could implement a comparator class:
class comparing_medicines implements Comparator<medicine>{

	@Override
	public int compare(medicine o1, medicine o2) {
		//In this case we will compare the price, we will order this TreeSet according to their classification.
		return o1.getClassification().compareTo(o2.getClassification());
	}
	
}


public class Sample_Comparator {
	public static void main(String [] args) {
		TreeSet<medicine> pharmacy= new TreeSet<>(new comparing_medicines());
		pharmacy.add(new medicine("Paracetamol", "A"));
		pharmacy.add(new medicine("Naproxen", "Z"));
		pharmacy.add(new medicine("Neutrogena", "H"));
		System.out.println(pharmacy);
	}

}
