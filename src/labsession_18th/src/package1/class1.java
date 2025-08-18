package package1;

public class class1 {
	//private
	private static String emplSalary = "344";
	private void fetchSalary() {
		System.out.println("The emp is"+emplSalary);
	}
	//public
	public void display() {
		System.out.println("dis data");
		
	}
	//default var
	int employeeId = 23;
	
	void fetchEmpId() {
		System.out.println("emp id"+employeeId);
	}
	
	//protected 
	protected String name = "chitti";
	protected void empName1() {
		System.out.println("empName"+name);
	}
	
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class1 obj = new class1();
		obj.display();
	    
		obj.fetchSalary();
		

		obj.fetchEmpId();
		
		obj.empName1();
	}

}
