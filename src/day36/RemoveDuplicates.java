package day36;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'A', 'B', 'B', 'C', 'C' ));

        System.out.println(list);

        ArrayList<Character> nonDup = new ArrayList<>();

        for(Character each : list){
            if(!nonDup.contains(each)){
                nonDup.add(each);


            }
        }
        System.out.println(nonDup);
        System.out.println("=======================================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Cybertek School");

        ArrayList<String> list2 = new ArrayList<>();
        System.out.println("School");

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2));

        System.out.println("==========================");

        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println(list3.isEmpty());//true
        list3.add(10);

        System.out.println(list3.isEmpty());//false


    }
}
