package newprogram;

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a =100;
			int b = 100/0;
			System.out.println(b);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
