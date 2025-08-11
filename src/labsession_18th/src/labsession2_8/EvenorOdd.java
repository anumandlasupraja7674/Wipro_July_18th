package labsession2_8;

//use two threads to print even and odd numbers

class EvenThread extends Thread {
	public void run() {
		for (int i = 2;i<=10;i+=2) {
			System.out.println("even:"+i);
		}
	}
}

class OddThread extends Thread {
	public void run() {
		for (int i = 1;i<=10;i+=2) {
			System.out.println("odd:"+i);
		}
	}
}

public class EvenorOdd {
	public static void main(String[] args) {
		EvenThread et = new EvenThread();
		OddThread ot = new OddThread();
		
		et.start();
		ot.start();
		
	}
}