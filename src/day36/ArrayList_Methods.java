package day36;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
/*
    indexOf():
    lastIndexOf():
    contains():
    equals():
    isEmpty():


 */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); //0
        list.add(20); //1
        list.add(30); //2
        list.add(40); //3
        list.add(50); //4
        list.add(40); //5


        int a =list.indexOf(40);// if multiple indexes contain same elements, return the first one
        System.out.println(a);//3


        System.out.println(list.lastIndexOf(40));//5

        System.out.println(list.contains(100)); //false

    }
}
