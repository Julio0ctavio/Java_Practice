package Collections;
import java.util.LinkedList;

//This is a pretty sample of prime numbers, maybe I will check it once more to make some experiments.
public class Sample_linked_list {
	
	public static void main(String [] args)  {
		//Here in Java a linkedlist works as a double link.
		LinkedList<Integer> Prime = new LinkedList<>();
		int limit=50;
		int index=2;
		boolean prime_found=true;
		while (index <= limit) {
			if (index==2) {
				Prime.add(index);	
			} else {
				for (Integer temp: Prime) {
					if (index%temp == 0){
						prime_found = true;
						break;
					}else {
						prime_found = false;
					}
				}
				if (prime_found == false) {
					Prime.add(index);
				}
			}
			index++;
		}
		
		System.out.println(String.format("These are the fisrt %d prime numbers that exist: \n%s",limit,Prime));
	}

}
