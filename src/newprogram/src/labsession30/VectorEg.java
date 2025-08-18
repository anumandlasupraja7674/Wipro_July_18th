package labsession30;

import java.util.Vector;
import java.util.Iterator;

public class VectorEg {
    public static void main(String[] args) {
        // 1. Create a Vector
        Vector<String> colors = new Vector<>();

        // 2. Add 
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Initial Vector: " + colors);

        // 3. Insert element 
        colors.add(2, "Orange");
        System.out.println( colors);

        // 4. Access elements
        System.out.println(colors.get(1));
        System.out.println(colors.firstElement());
        System.out.println(colors.lastElement());

        // 5. Update elements
        colors.set(0, "Purple");
        System.out.println(colors);

        // 6. Remove elements
        colors.remove("Green"); 
        colors.remove(2);       
        System.out.println(colors);

        // 7. Iterate using Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<String> itr = colors.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        // 8. Iterate using for-each loop
        System.out.print("Iterating using for-each loop: ");
        for (String color : colors) {
            System.out.print(color + " ");
        }

        // 9. Check size and capacity
        System.out.println(colors.size());
        System.out.println( colors.capacity());
    }
}


