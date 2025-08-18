package package2;

import package1.class1;

public class class2 {
	public void print() {
		System.out.println("Print data");
	}

	protected String name = "chitti";
	protected void empName2() {
		System.out.println("empName"+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj1= new class1();
		class2 obj2= new class2();

		obj1.display();
		obj2.print();
		
		obj2.empName2();

	}

}
