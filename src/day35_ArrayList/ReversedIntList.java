package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversedIntList {
    /*
    Warmup tasks:
    1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
     */
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(10); //10-int Autoboxing
        list.add(20);
        list.add(1,30);
        list.add(40);
        list.add(50);


        System.out.println(list.size());

        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");


        }






    }

        }


