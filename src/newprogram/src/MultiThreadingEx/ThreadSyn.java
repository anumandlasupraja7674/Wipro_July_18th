package MultiThreadingEx;

public class ThreadSyn {
	private int c=0;  //shared var 
	//sync method to increment counter 
	
	public synchronized void inc() {
		c++;
	}
	//sync method to get the counter value 
	
	public synchronized int get() {
		return c;
	}

}
