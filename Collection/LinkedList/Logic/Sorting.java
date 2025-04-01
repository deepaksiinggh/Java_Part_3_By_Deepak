package Collection.LinkedList.Logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new LinkedList<>();
        a1.add(34);
        a1.add(2);
        a1.add(27);
        a2.add(344);
        a2.add(22);
        a2.add(277);

        a1.addAll(a2);
        Collections.sort(a1);
        System.out.println(a1);
    }
}
