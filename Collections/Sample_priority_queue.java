package Collections;
import java.util.PriorityQueue;

public class Sample_priority_queue {
	public static void main(String [] args) {
		/*
		 * The priority queue orders each own items with a natural way, 
		 * in this example we don't have a comparator yet, but we can specify 
		 * which order must be considered.
		 * */
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		numbers.add(1000);
		numbers.add(200);
		/*
		 * For a capacity-constrained queue, the difference is that add() always returns true 
		 * and throws an exception if it can't add the element, whereas offer() 
		 * is allowed to return false if it can't add the element.
		 * */
		numbers.offer(5);
		numbers.offer(100);
		System.out.println(numbers);
		//Select the first element in the queue:
		System.out.println(numbers.peek());
		//Delete the element as FIFO(first in, first out) terms:
		System.out.println(numbers.poll());
		//Make sure this element could be deleted from the queue: (This will return a boolean data)
		System.out.println(numbers.remove(54));
		System.out.println(numbers);
	}
}
