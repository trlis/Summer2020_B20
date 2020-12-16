package day34_WrapperClass;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_Practice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list  = new ArrayList<>();
       Integer a =1;
        System.out.println(list.remove(a));

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer each : list){
            if(each>max){
                max = each;
            }
            if(each<min){
                min = each;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
