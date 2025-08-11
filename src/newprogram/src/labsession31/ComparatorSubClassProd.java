package labsession31;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ComparatorSubClassProd implements Comparator<Products>{
	
	@Override
	public int compare(Products e1, Products e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);// sorting by name 
		//return e1.Price - e2.Price;//sorting by price
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Products> pro = new ArrayList<>();
		pro.add(new Products("book", 34));
		pro.add(new Products("pen", 33));
		pro.add(new Products("plank", 24));
		pro.add(new Products("biscuit", 56));
		pro.add(new Products("bangles", 67));
		
		Collections.sort(pro, new ComparatorSubClassProd());
		
		for (Products p: pro) {
			System.out.println(p);
		}

	}

	

}


