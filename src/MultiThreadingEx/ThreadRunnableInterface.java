package MultiThreadingEx;

public class ThreadRunnableInterface implements Runnable{ 
	public void run() {
		//System.out.println("Thread is running");
		
		System.out.println("Thread"+Thread.currentThread().getId()+"ss running");
	}
	

}
