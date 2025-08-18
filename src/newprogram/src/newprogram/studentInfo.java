package newprogram;

public class studentInfo {
	String studName = "Supraja";
	int age = 21;
	String department  = "CSE";
	public void studentDetails() {
		String studName = "Supraja";
		int age = 21;
		float height = 5.05f;
		String graduation  = "CSE";
		System.out.println(studName);
		System.out.println(age);
		System.out.println(height);
		System.out.println(graduation);
		
	}
	public static void main(String[] args) {
		studentInfo stud = new studentInfo();
		stud.studentDetails();
		
	}
    

}

