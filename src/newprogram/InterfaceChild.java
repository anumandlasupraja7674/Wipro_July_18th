package newprogram;

public class InterfaceChild implements Interface1{
	
	public void display() { //abstract method override
		System.out.println("displaying");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj = new InterfaceChild();
		
		obj.display();
		
		Interface1.write();  //if we want to write in interfacechild then use directly in this like this
		
		obj.show(); //default method which is in Interface1
		
		System.out.println(empName); //Interface1 var
		System.out.println(empID);   //Interface1 var
		

	}

}
