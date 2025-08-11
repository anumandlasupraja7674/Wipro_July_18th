package labsession31;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeComp implements Comparable<EmployeeComp>{
	int id;
	String name;
	
	//constructor of the class to pass the parameters 
	public EmployeeComp(int id, String name) {
		this.id= id;
		this.name = name;
		
	}
	
	@Override
	public int compareTo(EmployeeComp e) {
		// TODO Auto-generated method stub
		return this.name.compareTo(e.name);
	}
	public String toString() {
		return id + "_"+name;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeComp> stud = new ArrayList<>();
		
		stud.add(new EmployeeComp(103, "abhi"));
		stud.add(new EmployeeComp(102, "sup"));
		stud.add(new EmployeeComp(101, "navya"));
		
		Collections.sort(stud);
		
		for(EmployeeComp st: stud) {
			System.out.println(st);
		}
		

	}


	

}

