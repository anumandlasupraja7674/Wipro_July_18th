package labsession2_8;

import java.util.Arrays;

//3.sort an integer array using multiple threads.

class merge extends Thread {
 int[] arr;
 int start, end;

 public merge(int[] arr, int start, int end) {
     this.arr = arr;
     this.start = start;
     this.end = end;
 }

 public void run() {
     Arrays.sort(arr, start, end);
 }
}

public class sortanArray{
 public static void main(String[] args) throws InterruptedException  {
     int[] arr = {9, 4, 7, 1, 5, 3, 6, 2};
     
     int mid = arr.length / 2;
     merge t1 = new merge(arr, 0, mid);
     merge t2 = new merge(arr, mid , arr.length);

     t1.start();
     t2.start();

     t1.join(); // main thread waits till your t1 thread executes essentially used for synchronization.
     t2.join(); // Without join(), the main thread may continue and execute the next lines before the
                // child threads finish their work. This can lead to: Incomplete output ,Wrong result.

     System.out.println("array after individual sorting : "+ Arrays.toString(arr));

     int[] result = new int[arr.length];
     for (int i = 0; i < arr.length; i++) {
         result[i] = arr[i];
     }
     
     System.out.println("result array before sorting : " + Arrays.toString(result));
     
     Arrays.sort(result);

     System.out.println("result array after sorting : " + Arrays.toString(result));
 }
}