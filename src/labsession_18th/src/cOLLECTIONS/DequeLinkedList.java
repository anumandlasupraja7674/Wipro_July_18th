package cOLLECTIONS;

import java.util.Deque;
import java.util.LinkedList;


public class DequeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new LinkedList<>();
		deque.addFirst("python");
		deque.addFirst("Java");
		deque.addFirst("C");
		deque.addFirst("C++");
		deque.addLast("js");
		System.out.println(deque);
		
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());
		
		System.out.println(deque);
	    
		System.out.println(deque.peekFirst());
	    System.out.println(deque.pollFirst());
	    
	    System.out.println(deque);
	    
	    System.out.println(deque.peekLast());
	    System.out.println(deque.pollLast());
	    
	    System.out.println(deque);
	    
	    deque.addFirst("react");
	    System.out.println(deque);
	    
		
		
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		System.out.println(deque);
		
	    
		
		
		
		
	}

}
