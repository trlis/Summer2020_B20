package day36;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practice {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(15);
        list.add(10);
        list.add(40);
        list.add(30);

        ArrayList<Integer> desc = new ArrayList<>();
        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            desc.add(list.get(i));

        }
        System.out.println(desc);

/*      2 approach

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        */

    }
}

