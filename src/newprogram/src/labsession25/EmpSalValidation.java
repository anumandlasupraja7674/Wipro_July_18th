package labsession25;

class emp {
	private String name;
	private int id;
	private double salary;
	
	emp(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void setSal(double salary) {
		
		if (salary > 0) {
			System.out.println("Salary must be posistive");
		} 
		else {
			System.out.println("sal not a negative");
		}
	}
	
	void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
 
    }
	
}

public class EmpSalValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e = new emp("supraja", 5,-33444);
		emp e1 = new emp("ssjj", 2, 34564);
		emp e2 = new emp("niki", 7, 55666);
		emp e3 = new emp("bhanu", 3, 45678);
		
		e.setSal(-7889);
		
		e.displayDetails();
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
		

	}

}
