package package1;

public class SamePackSubClass extends class1{
	public void read() {
		System.out.println("Reading in sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamePackSubClass obj = new SamePackSubClass();
		obj.display();
		obj.read();
		obj.fetchEmpId();
		
		//obj.empName();

	}

}
