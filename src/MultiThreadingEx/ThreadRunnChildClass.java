package MultiThreadingEx;

public class ThreadRunnChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i = 1;i<n;i++) {
			Thread obj = new Thread(new ThreadRunnableInterface());
			obj.start();
		}

	}

}
