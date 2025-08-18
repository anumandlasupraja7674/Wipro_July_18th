package labsession23;

class Employee {
	public void work() {
		System.out.println("Employee work");
	}
	public void getSalary() {
		System.out.println("Employee sal");
	}
}

class HRManager extends Employee {
	public void work() {
		System.out.println("emp work");
	}
	public void addEmployee() {
		System.out.println("emp work one");
	}
}

public class empData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee();
		em.work();
		em.getSalary();

	HRManager hr = new HRManager();
	hr.work();
	hr.addEmployee();

	}

}



