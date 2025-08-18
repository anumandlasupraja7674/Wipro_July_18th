package newprogram;

public class AbstractchildClassEg extends AbstractClassEg{
	
	void makesound() {
		System.out.println("Animal make sound");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractchildClassEg eg= new AbstractchildClassEg();
		
		eg.makesound();
		eg.eat();
		
		System.out.println(AbstractClassEg.aniName); //static variable
		//System.out.println(AbstractClassEg.aniBehaviour); 
		//final keyword is not used here because parent class not inherited...

	}

}
