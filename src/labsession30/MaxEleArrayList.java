package labsession30;

import java.util.*;

public class MaxEleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(15);
        num.add(42);
        num.add(8);
        num.add(23);
        num.add(12);
        num.add(31);

        //int max = Collections.max(num);

        //System.out.println(max);
        
        //or 
        Collections.sort(num);
        System.out.println(num);
        int secondLarg = num.get(num.size() - 1);

        System.out.println(secondLarg);
    }
}

