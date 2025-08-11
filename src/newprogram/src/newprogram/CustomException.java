package newprogram;

public class CustomException {

	public static void checkage(int age) throws Exception {
		if (age < 18) {
			System.out.println("Creating a new exception");
	
		Thread.sleep(5000);
		
		//use throw exception 
		throw new Exception("Age must be 18 or older to vote");
		}
		else {
			System.out.println("Person is not eligible for voting");
		}
		
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustomException obj = new CustomException();
		obj.checkage(12);
		

	}

}
