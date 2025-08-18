package newprogram;

public class multilevelSubClassOne extends multilevelsubClass {
	String daughter = "supraja";
	public void display() {
	
		System.out.println("daughter is "+daughter);
		public static void main(String[] args) {
			multilevelsubClass obj = new multilevelsubClass();
			obj.display();
			obj.mother();
			
			
		}
		
	}
	
   
}
