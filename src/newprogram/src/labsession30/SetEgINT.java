package labsession30;

import java.util.Set;
import java.util.TreeSet;

public class SetEgINT {
	
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		System.out.println(set.add(23));
		System.out.println(set.remove(3));
		System.out.println(set.contains(3));
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
	}

}
