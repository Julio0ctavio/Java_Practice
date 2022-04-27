package Lambdas.comparators;

import java.util.Objects;

public class employee {
	
	private String last_name, first_name;
	private int age;
	public employee(String first_name, String last_name, int age){
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "\n-> " + " [last_name=" + last_name + ", first_name=" + first_name + ", age=" + age + ", getLast_name()="
				+ getLast_name() + ", getFirst_name()=" + getFirst_name() + ", getAge()=" + getAge() + "]\n";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(first_name, last_name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name);
	}
	
	
	
}
