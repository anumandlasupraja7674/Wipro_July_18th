package newprogram;

public class ChildInterfacesAB implements InterfaceA, InterfaceB {
	public void display() {
		System.out.println("displaying the data");
	}
	
	public static void main(String[] args) {
		ChildInterfacesAB ab = new ChildInterfacesAB();
		
		ab.display();
		
		
		InterfaceA aRef = ab;
		aRef.display();
		
		InterfaceB bRef = ab;
		bRef.display();
		
		InterfaceA.read();
		InterfaceB.read();
		
		
		}
}
