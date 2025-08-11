package cOLLECTIONS;

import java.util.*;

public class EqualsMethod {
	int id;
	String name;
	
	EqualsMethod(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	//overriding equal() to compare the obj content
	public boolean equals(Object obj) {
		if (this == obj) return true; //same refernce
		if (obj == null || getClass() != obj.getClass()) return false; 
		
		Employee other  = (Employee)obj;
		 return this.id == other.id && this.name.equals(other.name);

	}
	
	
	public int hashCode() {
		return (Objects.hash(id, name));
	}
	
	public String toString() {
		return id+" "+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(103, "Ravi"));
		emp.add(new Employee(101, "Ravi"));
		emp.add(new Employee(102, "Ravi"));
		emp.add(new Employee(102, "Ravi"));
		emp.add(new Employee(104, "Ravi"));
		
		for(Employee e:emp) {
			System.out.println(e);
		}

	}

}
