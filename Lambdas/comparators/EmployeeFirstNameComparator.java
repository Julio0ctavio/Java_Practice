package Lambdas.comparators;

import java.util.Comparator;

public class EmployeeFirstNameComparator implements Comparator<employee> {

	@Override
	public int compare(employee o1, employee o2) {
		return o1.getFirst_name().compareTo(o2.getFirst_name());
	}
}
