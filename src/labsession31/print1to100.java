package labsession31;

public class print1to100 {
	public void print(int num) {
		if(num <=100) {
			System.out.println(num);
			 print(num+1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1to100 one = new print1to100();
		
		one.print(1);
	
		

	}

}
