package cOLLECTIONS;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;


public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		/*an obj that maps keys to values
		 each key can map to atmost one value 
		 ordering - it is sorted based on the keys 
		 values can be duplicated 
		 only one null as key is allowed 
		 multiple null values are allowed  
		 */
		
		map.put(1, "Amit");
		map.put(2 , "Vijay");
		map.put(3, "Rahul");
		map.put(4, "Amit");
		map.put(4, "Amruta");
		map.put(null, "sup");
		map.put(null, "navya");
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
