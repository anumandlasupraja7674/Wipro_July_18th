package labsession30;

import java.util.*;

public class ColorArrayList {
    public static void main(String[] args) {
       
        ArrayList<String> col = new ArrayList<>();

      
        
   
		
        // adD
        col.add("Red");
        col.add("Green");
        col.add("Blue");
        System.out.println(col);

        // add
        col.add(1, "Yellow");
        System.out.println(col);

       
        

        // get
        System.out.println(col.get(3));

        // set(int, E)
        System.out.println(col.set(0, "Violet"));

        // contains
        System.out.println(col.contains("Green"));


        // indexOf
        System.out.println(col.indexOf("Pink"));

        // lastIndexOf(Object)
        System.out.println(col.lastIndexOf("Pink"));

        // remove(Object)
        System.out.println(col.remove("Red"));

 
        // isEmpty()
        System.out.println(col.isEmpty());

        // size()
        System.out.println("List size: " + col.size());

        // toArray()
        Object[] colArray = col.toArray();
        System.out.println(Arrays.toString(colArray));
        
        // iterator()
        Iterator<String> it = col.iterator();
     
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    

        // listIterator()
        ListIterator<String> lit = col.listIterator();
  
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }
        System.out.println();

        
        // subList(int, int)
        List<String> sub = col.subList(1, 3);
        System.out.println(sub);


       
    }


        
    }
