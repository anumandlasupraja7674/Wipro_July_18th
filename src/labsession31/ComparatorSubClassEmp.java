package labsession31;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ComparatorSubClassEmp implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return Double.compare(e2.sal,e1.sal);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Ravi", 34000));
		emp.add(new Employee("Amit", 35000));
		emp.add(new Employee("Zara", 24000));
		emp.add(new Employee("Zara", 56000));
		emp.add(new Employee("John", 67000));
		
		Collections.sort(emp, new ComparatorSubClassEmp());
		
		for (Employee e: emp) {
			System.out.println(e);
		}

	}

	

}

