package newprogram;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s1 = null;
			System.out.println(s1.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
