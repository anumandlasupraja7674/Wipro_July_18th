package newprogram;

class superClass {
	String name = "Sulochana";
	public void grandmother() {
      System.out.println("Grandmother name is"+name);
	}

}
class subClass extends superClass{
    String nameOne = "Navya";
    public void mother() {
   	System.out.println("Mother name is"+nameOne);
	
	}

}





public class multilevel extends subClass{
	String daughter = "supraja";
	public void display() {
		System.out.println("daughter name is"+daughter);
	}
	
		public static void main(String[] args) {
			multilevel obj = new multilevel();
			obj.display();
			obj.mother();
			obj.grandmother();
			
			
		}
		
	}


