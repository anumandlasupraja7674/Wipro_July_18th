package newprogram;

public class methodOverload {
	public int add(int a, int b)  {
		int c= a+b;
		return c;
	}
	public int add(int a, int b, int c)  {
		int d= a+b+c;
		return d;
	}
	public double add(int a, int b, int c, int d)  {
		int e= a+b+c+d;
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverload mo = new methodOverload();
		System.out.println(mo.add(2, 8));
		System.out.println(mo.add(2, 4,8));
		System.out.println(mo.add(2, 8, 4,5));

	}

}
