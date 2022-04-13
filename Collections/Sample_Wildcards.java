package Collections;
import java.util.Arrays;
import java.util.List;

public class Sample_Wildcards {
	
	//A Wildcard will let us use any kind of parameter who extends from Numbers class. (This is the wildcard ?)
	static double sum_items(List<? extends Number> values) {
		double sum=0;
		for(Number value: values){
			sum+=value.doubleValue();
		}
		return sum;
	}
	
	public static void main(String [] args) {
		double sum = sum_items(Arrays.asList(10.5447,78,45f,250000l));
		System.out.println("Sum's result:" + Arrays.asList(10.5447,78,45f,250000l));
		System.out.println(sum);
		
	}
}
