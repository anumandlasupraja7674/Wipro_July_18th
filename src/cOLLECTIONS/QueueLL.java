package cOLLECTIONS;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueLL {
    public static void main(String[] args) {
       
        Queue<String> queue = new LinkedList<>();

        // 1. add
        queue.add("One");
        queue.add("Two");
        queue.add("Three");

        // 2. offer(): Inserts the element
        queue.offer("Four");
        queue.offer("Five");

        System.out.println(queue);

        // 3. element(): Retrieves the first element but does not remove from the queue (throws NoSuchElementException if empty)
        System.out.println(queue.element());

        // 4. peek(): Retrieves, but does not remove, the head of this queue, or returns null if queue is empty
        System.out.println(queue.peek());

        // 5. remove(): Retrieves and removes the head of this queue (throws NoSuchElementException if empty)
        System.out.println(queue.remove());

        // 6. poll(): Retrieves and removes the head of this queue, or returns null if empty
        System.out.println(queue.poll());

        // 7. size(): Number of elements
        System.out.println(queue.size());

        // 8. isEmpty(): Check if queue is empty
        System.out.println(queue.isEmpty());

        // 9. contains(Object o): Check if queue contains a specific element
        System.out.println(queue.contains("Three"));

        // 10. iterator(): Get iterator to loop through queue
       
        Iterator<String> it = queue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. toArray(): Convert queue to array
        Object[] arr = queue.toArray();
        System.out.println( Arrays.toString(arr));

        // 12. clear(): Removes all elements from queue
        queue.clear();
        System.out.println(queue);
        System.out.println(queue.isEmpty());

        
    }
}

