package Streams;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Predicate;
import java.util.stream.Collectors;

class locomotive{
	
	private String name, type;
	private boolean dcc;
	
	locomotive(String name, String type, boolean dcc){
		this.name = name;
		this.type = type;
		this.dcc = dcc;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isDcc() {
		return dcc;
	}

	public void setDcc(boolean dcc) {
		this.dcc = dcc;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "\t-> locomotive [name=" + name + ", type=" + type + ", dcc=" + dcc + "]\n\t";
	}
	
}


public class TestStream {
	public static void main(String[] args) {
		locomotive []locos = {
				new locomotive("CP Rail 5612", "Diesel", true), 
				new locomotive("Southern 7080", "Steam", true), 
				new locomotive("Norkfold Southern 4270", "Diesel", false),
				new locomotive("Santa Fe NA", "Diesel", false),
				new locomotive("N de M 8015", "Diesel", true)
				};
		List<locomotive> trains = Arrays.asList(locos);
		
//		The next sample is very common and large, would be the tipical functional method:
		
//		List<locomotive> dcc_trains = new ArrayList<>();
//		for(locomotive train : trains) {
//			if(train.isDcc()) {
//				dcc_trains.add(train);
//			}
//			if(dcc_trains.size() == 3) {
//				break;
//			}
//		}
		
//		What about using stream with anonymous classes?
		
//		List<locomotive> dcc_trains = trains.stream().filter(new Predicate<locomotive>() {
//
//			@Override
//			public boolean test(locomotive t) {
//				//Evaluates if my loco is dcc or not:
//				return t.isDcc();
//			}			
//			
//		}).limit(3).collect(Collectors.toList());
//		
//		System.out.println(dcc_trains);
		
//		This is the magic of stream using lambdas:
		List<locomotive> dcc_trains = trains.stream().filter(loco -> loco.isDcc()).limit(3).collect(Collectors.toList());
		System.out.println("DCC locomotives:\n\n\t" + dcc_trains);
	}
}
