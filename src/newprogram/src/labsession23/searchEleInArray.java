package labsession23;

public class searchEleInArray {

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};

    
        int searchElement = 30;

        boolean found = false;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + searchElement + " found at index " + index + ".");
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }
}

