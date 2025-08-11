package cOLLECTIONS;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;


public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		/*an obj that maps keys to values
		 A map cannot contain duplicates keys
		 each key can map to atmost one value 
		 map is sorted according to the natural ordering(ascending) of its keys.
		 values can be duplicated 
		 no null as key is allowed 
		 multiple null values are allowed 
		 this implementation is not synchronized 
		 */
		
		map.put(1, "Amit");
		map.put(2 , "Vijay");
		map.put(3, "Rahul");
		map.put(4, "Amit");
		map.put(4, "Amruta");
		//map.put(null, "sup");
		//map.put(null, "navya");
		map.put(6, null);
		map.put(7, null);
		System.out.println(map);
		//converting map to set 
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}

		}

}
