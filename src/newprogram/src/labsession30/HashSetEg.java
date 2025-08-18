package labsession30;
import java.util.*;


public class HashSetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 = new HashSet<String>();
		
		//no duplicate element
		//no guranteed element
		//multiple null values are allowed but gives only once as result
		//not snychronized 
		//operations are faster than the list interface
		
		s1.add("s");
		s1.add("u");
		s1.add(null);
		s1.add("p");
		
		System.out.println(s1);
		
		System.out.println(s1.contains("o"));
		System.out.println(s1.remove("u"));
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		//System.out.println(s1.equals("u"));
		System.out.println(s1.hashCode());
		
		
		
		
		

	}

}
