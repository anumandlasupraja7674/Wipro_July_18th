package package1;

public class SamePackNonSubClass {
	public void write() {
		System.out.println("writing in sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj = new class1();
		SamePackNonSubClass obj1 = new SamePackNonSubClass();
		obj1.write();
		obj.display();
		
		obj.fetchEmpId();
		
		//obj1.empName1();
		
		

	}

}
