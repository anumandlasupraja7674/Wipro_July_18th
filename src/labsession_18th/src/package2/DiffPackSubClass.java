package package2;
import package1.class1;

public class DiffPackSubClass extends class1{
	public void create() {
		System.out.println("creating in sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiffPackSubClass obj = new DiffPackSubClass();
		obj.create();
		obj.display();

	}

}
