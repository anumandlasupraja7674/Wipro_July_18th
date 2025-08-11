package labsession30;

import java.util.*;

public class SortOfEle {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(2);
        num.add(8);
        num.add(1);
        num.add(4);

        Collections.sort(num);

        System.out.println(num);
    }
}

