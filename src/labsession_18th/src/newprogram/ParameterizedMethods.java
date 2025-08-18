package newprogram;

public class ParameterizedMethods {
	public void sub() {
		int a = 20;
		int b= 30;
		int c = a-b;
		System.out.println(c);
	}
	public void sub1(int a, int b) {
		int c = a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		ParameterizedMethods pm = new ParameterizedMethods();
		pm.sub1(20,40);
		pm.sub();
	}

}
