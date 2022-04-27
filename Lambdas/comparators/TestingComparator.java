package Lambdas.comparators;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestingComparator {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Using comparator, these items are sorted by the last name inside of a lambda expression:
		Comparator<employee> comparator_last_name = (employee e1, employee e2)->e1.getLast_name().compareTo(e2.getLast_name());
		//This lets you keep your "integers" in an array of primitives, and avoid autoboxing before calling an instance method inside of a lambda expression.
		Comparator<employee> comparator_with_age = (employee e1, employee e2)->Integer.compare(e1.getAge(), e2.getAge());
		Set<employee> employees = new TreeSet<>(comparator_with_age);
		employees.add(new employee("Julio", "Lozano", 23));
		employees.add(new employee("German", "Rodriguez", 28));
		employees.add(new employee("Nubia", "Barba", 36));
		System.out.println(employees);
	}
}
