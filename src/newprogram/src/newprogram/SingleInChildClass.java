package newprogram;

public class SingleInChildClass extends SingleInSuperClass{
	String model = "Mustang";
	public void display() {
		System.out.println("Brand is "+ brand);
		System.out.println("Model is "+model);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInChildClass obj = new SingleInChildClass();
		obj.start();
		obj.display();

	}

}
