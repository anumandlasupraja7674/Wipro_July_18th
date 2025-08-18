package labsession24;

//College Admission System
//Abstract class Student:
//Fields: name, rollNo
//Abstract method: getGrade()
//Subclasses:
//EngineeringStudent
//MedicalStudent
//Each implements getGrade() based on marks.

abstract class student {
	String name;
	int rollNo;
	abstract void getGrade();
	
}


class EnggStud extends student {
	int marks;
	EnggStud(String name, int rollNo, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	void getGrade() {
		if (marks>=90) {
			System.out.println("Grade: "+"A");
		}
		else if(marks >=75) {
			System.out.println("Grade: "+"B");
		}
		else {
			System.out.println("Grade: "+"C");
		}
	}
	
}

class medStud extends student {
	int marks;
	medStud(String name, int rollNo, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	void getGrade() {
		if (marks>=90) {
			System.out.println("Grade: "+"A");
		}
		else if(marks >=75) {
			System.out.println("Grade: "+"B");
		}
		else {
			System.out.println("Grade: "+"C");
		}
	}
	
}



public class collegeAdminSys {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		EnggStud es = new EnggStud("supraja", 234, 95);
		es.getGrade();
		
		medStud ms = new medStud("nikki", 247, 85);
		ms.getGrade();
		
		
		
		

	}

}
