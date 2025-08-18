package package2;

import package1.class1;

public class DiffPackNonSubClass {
	public void print() {
		System.out.println("printing the data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj = new class1();
		
		DiffPackNonSubClass obj1 = new DiffPackNonSubClass();
		obj.display();
		obj1.print();
	}

}
