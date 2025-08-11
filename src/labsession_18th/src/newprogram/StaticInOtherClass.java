package newprogram;

public class StaticInOtherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticVar.clg);
		System.out.println(StaticVar.name);
		System.out.println(StaticVar.gender);
		
		StaticVar in = new StaticVar();
		System.out.println(in.rollNo);
		System.out.println(in.branch);
        
	}

}
