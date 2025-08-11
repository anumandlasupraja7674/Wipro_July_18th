package labsession30;


import java.util.Set;
import java.util.HashSet;



public class DuplicateEleInSet {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 10, 40, 50, 20, 60};

        Set<Integer> uniSet = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int num : data) {
            if (!uniSet.add(num)) {
                duplicate.add(num);
            }
        }

        System.out.println(uniSet);
        System.out.println(duplicate);
    }
}

