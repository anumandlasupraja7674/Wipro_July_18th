package labsession2_8;

public class HelloWorldusingthread extends Thread {
    public void run() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
    	HelloWorldusingthread thread = new HelloWorldusingthread();
        thread.start();  
    }
}


