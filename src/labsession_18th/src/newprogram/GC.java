package newprogram;

public class GC {
	public void finalise(){
		System.out.println("Garbage is collected");
	}

	public static void main(String[] args) {
		GC obj1 = new GC();
		GC obj2 = new GC();
		
		obj1 = obj2;
		System.gc();
		//Runtime.getRuntime().gc();
		
		
		

	}

}
