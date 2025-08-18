package cOLLECTIONS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
	int rollNo;
	String name;
	
	//constructor of the class to pass the parameters 
	public Student(int rollNo, String name) {
		this.rollNo= rollNo;
		this.name = name;
		
	}
	
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.rollNo -  s.rollNo;
	}
	public String toString() {
		return rollNo + "_"+name;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stud = new ArrayList<>();
		
		stud.add(new Student(103, "abhi"));
		stud.add(new Student(102, "sup"));
		stud.add(new Student(101, "navya"));
		
		Collections.sort(stud);
		
		for(Student s: stud) {
			System.out.println(s);
		}
		

	}


	

}
