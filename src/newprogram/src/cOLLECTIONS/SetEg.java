package cOLLECTIONS;

import java.util.Set;
import java.util.TreeSet;

public class SetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 = new TreeSet<String>();
		
		//contains no duplicate elements 
		//no null values are present 
		//non synchronized 
		//data is displayed in ascending order 
		
		//operations are faster than the lists interface 
		
		s1.add("apple");
		s1.add("banana");
		s1.add("pineapple");
		s1.add("papaya");
		
		System.out.println(s1);
		s1.remove("pineapple");
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.size());
		

	}

}
