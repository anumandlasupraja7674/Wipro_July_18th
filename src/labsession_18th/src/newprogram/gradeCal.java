package newprogram;

public class gradeCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 98;
		if (90 <= number && number >= 100) {
			System.out.println("A");
		}
		else if (75 <= number && number >= 89) {
			System.out.println("B");
		}
		else if (60 <= number && number >= 74) {
			System.out.println("C");
		}
		else if (40 <= number && number >= 58) {
			System.out.println("D");
		}
		else {
			System.out.println("Fail");
			
		}

	}

}
