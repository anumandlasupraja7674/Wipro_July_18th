package labsession30;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;




public class StackEg {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();

       
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");

        System.out.println(stack);

        // 2. peek(): View the top element without removing it
        System.out.println(stack.peek());

        // 3. pop(): Removes and returns the top element
        System.out.println(stack.pop());
        System.out.println(stack);

        // 4. search(): Returns 1-based position from top or -1 if not found
        System.out.println(stack.search("Banana"));
        System.out.println(stack.search("Mango"));

      
        System.out.println(stack.isEmpty());

     
        System.out.println(stack.size());

        System.out.println(stack.contains("Cherry"));
        System.out.println(stack.contains("Apple"));

        // 8. get(int index): Get element at index (inherited from Vector)
        System.out.println(stack.get(1)); // 0-based index

        // 9. clear(): Removes all elements from stack
        stack.clear();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        
        System.out.println(stack);
        
     // 1. add(), addAll(), addElement()
        stack.add("Apple");
        stack.add("Banana");
        stack.addElement("Cherry");
        stack.addAll(Arrays.asList("Date", "Elderberry"));
        stack.addAll(2, Arrays.asList("Fig", "Grape"));

        // 2. capacity()
        System.out.println("Capacity: " + stack.capacity());

  
        // 4. contains(), containsAll()
        System.out.println("Contains 'Banana'? " + stack.contains("Banana"));
        System.out.println("Contains all [Date, Elderberry]? " +
                stack.containsAll(Arrays.asList("Date", "Elderberry")));

        // 5. copyInto()
        String[] array = new String[stack.size()];
        stack.copyInto(array);
        System.out.println("Copied into array: " + Arrays.toString(array));

        // 6. elementAt()
        System.out.println("Element at index 3: " + stack.elementAt(3));

        // 7. elements()
        Enumeration<String> e = stack.elements();
        System.out.print("Elements: ");
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        // 8. ensureCapacity()
        stack.ensureCapacity(20);
        System.out.println("Capacity after ensureCapacity(20): " + stack.capacity());

       

        // 10. firstElement()
        System.out.println("First element: " + stack.firstElement());

        // 11. forEach()
        System.out.print("forEach output: ");
        stack.forEach(System.out::print);
        System.out.println();

        // 12. get(), indexOf(), insertElementAt()
        System.out.println("Get at index 2: " + stack.get(2));
        System.out.println("Index of 'Fig': " + stack.indexOf("Fig"));
        stack.insertElementAt("Honeydew", 1);
        System.out.println("After insertElementAt: " + stack);

        // 13. isEmpty(), iterator()
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.print("Iterator: ");
        for (Iterator<String> it = stack.iterator(); it.hasNext(); )
            System.out.print(it.next() + " ");
        System.out.println();

        // 14. lastElement(), lastIndexOf()
        System.out.println("Last element: " + stack.lastElement());
        System.out.println("Last index of 'Apple': " + stack.lastIndexOf("Apple"));
        System.out.println("Last index of 'Fig' from index 4: " + stack.lastIndexOf("Fig", 4));

        // 15. listIterator()
        System.out.print("ListIterator: ");
        ListIterator<String> listIt = stack.listIterator();
        while (listIt.hasNext()) System.out.print(listIt.next() + " ");
        System.out.println();

        // 16. remove(Object), remove(int), removeAll()
        stack.remove("Honeydew");
        stack.remove(0);
        stack.removeAll(Arrays.asList("Date", "Fig"));
        System.out.println("After removals: " + stack);

        // 17. removeAllElements(), removeElement(), removeElementAt()
      
      
        stack.removeElement("Banana");
        stack.removeElementAt(1);
        System.out.println("After removeElement & removeElementAt: " + stack);

        // 18. removeIf()
        stack.removeIf(s -> s.startsWith("E"));
        System.out.println("After removeIf: " + stack);

        // 19. replaceAll(), retainAll()
        stack.add("Kiwi");
        stack.add("Lemon");
        stack.replaceAll(String::toUpperCase);
        System.out.println("After replaceAll: " + stack);
        stack.retainAll(Arrays.asList("KIWI", "LEMON"));
        System.out.println("After retainAll: " + stack);

        // 20. set(), setElementAt(), setSize()
        stack.set(0, "Mango");
        stack.setElementAt("Orange", 1);
        stack.setSize(5);
        System.out.println("After set & setElementAt & setSize: " + stack);

        // 21. size()
        System.out.println("Size: " + stack.size());

        // 22. sort()
        stack.sort(Comparator.nullsLast(String::compareTo));
        System.out.println("After sort: " + stack);

        

        // 24. subList()
        List<String> sub = stack.subList(0, 2);
        System.out.println("SubList(0,2): " + sub);

        // 25. toArray(), toArray(T[])
        Object[] objArr = stack.toArray();
        String[] strArr = stack.toArray(new String[0]);
        System.out.println("toArray(): " + Arrays.toString(objArr));
        System.out.println("toArray(T[]): " + Arrays.toString(strArr));

        // 26. toString(), trimToSize(), clear()
        System.out.println("toString(): " + stack.toString());
        stack.trimToSize();
        System.out.println("After trimToSize, capacity: " + stack.capacity());
        stack.clear();
        System.out.println("After clear: " + stack);
    }
}


