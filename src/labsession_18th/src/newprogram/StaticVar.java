package newprogram;

public class StaticVar {
	public static String name = "Supraja";
	public int rollNo = 34444;
	public String branch = "CSE";
	public static String clg = "SWEC";
	public static String gender = "female";
	
	

	public static void main(String[] args) {
		StaticVar st = new StaticVar();
		
		// TODO Auto-generated method stub
        
		System.out.println(name);
		System.out.println(gender);
		System.out.println(st.rollNo);
		System.out.println(clg);
		System.out.println(st.branch);
	}

}
