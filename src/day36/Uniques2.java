package day36;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques2 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        ArrayList<Integer> uniques = new ArrayList<>();

        for(int k = 0 ;k<= list.size()-1; k++){
            Integer element = list.get(k);
            int count = Collections.frequency(list, element);

            if(count==1) {
                uniques.add(element);
            }

        }
        System.out.println(uniques);

    }
}

