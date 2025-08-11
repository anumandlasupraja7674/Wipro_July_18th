package cOLLECTIONS;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ComparatorSubClass implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);  //ascending order
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(103, "Ravi"));
		emp.add(new Employee(101, "Amit"));
		emp.add(new Employee(102, "Zara"));
		emp.add(new Employee(102, "Zara"));
		emp.add(new Employee(104, "John"));
		
		Collections.sort(emp, new ComparatorSubClass());
		
		for (Employee e: emp) {
			System.out.println(e);
		}

	}

	

}
