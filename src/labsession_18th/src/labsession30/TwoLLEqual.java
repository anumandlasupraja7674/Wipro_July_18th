package labsession30;

import java.util.*;

public class TwoLLEqual {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        boolean isEqual = list1.equals(list2);

        System.out.println(isEqual);
    }
}

