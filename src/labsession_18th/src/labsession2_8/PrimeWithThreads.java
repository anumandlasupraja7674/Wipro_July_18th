package labsession2_8;

//sum prime numbers using multiple threads

class PrimeThread extends Thread {
    private int start, end;

    public PrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Check if a number is prime
   public boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i + " (Thread: " + Thread.currentThread().getName() + ")");
            }
        }
    }
}

public class PrimeWithThreads {
    public static void main(String[] args) {
        int range = 100;
        int parts = 4;  // number of threads
        int gap = range / parts;

        // Create and start threads
        for (int i = 0; i < parts; i++) {
            int start = i * gap + 1;
            int end = (i == parts - 1) ? range : (start + gap - 1);
            Thread t = new PrimeThread(start, end);
            t.start();
        }
    }
}

