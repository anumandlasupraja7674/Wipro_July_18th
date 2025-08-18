package newprogram;

public interface Interface1 {
  //abstract methods 
	//not use abstract and static at a time 
	
	abstract void display(); // abstract method
	
	static void write() { //not override in InterfaceChild
		System.out.println("writing");
	}
	default void show() {
		System.out.println("showing");
	
	}
	public static final String empName = "Sup";
	final int empID=234;
}
