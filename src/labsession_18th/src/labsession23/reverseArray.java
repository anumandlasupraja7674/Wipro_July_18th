package labsession23;

public class reverseArray {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.print("Original Array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();

        int left = 0;
        int right = originalArray.length - 1;

        while (left < right) {
            int temp = originalArray[left];
            originalArray[left] = originalArray[right];
            originalArray[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reverse Array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();
    }
}
