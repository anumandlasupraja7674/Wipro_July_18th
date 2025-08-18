package labsession30;

import java.util.*;

public class SecondLargEle {
    public static void main(String[] args) {
        List<Integer> numb = new ArrayList<>();
        numb.add(10);
        numb.add(20);
        numb.add(30);
        numb.add(40);
        numb.add(50);
        

        Collections.sort(numb);
        System.out.println(numb);
        int secondLarg = numb.get(numb.size() - 2);

        System.out.println(secondLarg);
    }
}
