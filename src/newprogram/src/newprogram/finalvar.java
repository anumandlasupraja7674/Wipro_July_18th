package newprogram;

final class FinalClass {
	
	//variable
    final int MAX_VALUE = 100;
    
    //method

    final void showMessage() {
        System.out.println("This is a final method from a final class.");
    }

    void displayValue() {
        System.out.println("MAX_VALUE: " + MAX_VALUE);
    }
}
//final methods are not overridden  and final classes cannot extends
//final class dis extends FinalClass {
	//void showMessage() {
		//System.out.println("This is a final method from a final class.");
	//}
//}

public class finalvar  {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        
       
        obj.showMessage();
        obj.displayValue();
    }
}



