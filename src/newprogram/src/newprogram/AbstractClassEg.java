package newprogram;

abstract class AbstractClassEg {
	

	
	
   
	abstract void makesound();
	
	//concrete methods 
	public void eat() {
		System.out.println("Animal eat food");
	}
	
	//constructor 
	AbstractClassEg() {
		System.out.println("Creating constructor");
	}
	
	//instance var 
	public static String aniName = "Lion";
	
	//final var 
	
	public final String aniBehaviour = "roars";
	
	
   
   
}
