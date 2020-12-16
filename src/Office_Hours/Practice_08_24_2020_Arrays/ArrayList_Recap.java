package Office_Hours.Practice_08_24_2020_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Recap {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        //list.addAll(1,2,3,4,5) - by default it is an Array
        list.addAll(Arrays.asList(1,2,3,4,5));
        /*
        addAll
        removeAll

        bulk Operations - can use only with Collecion
         */
        System.out.println(list);

        for(Integer each :list){
            System.out.println(each);
        }
        System.out.println("================================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(30,40,50,60,70,80,90,100,200));

        list2.removeAll(Arrays.asList(40,50,90,200));

        System.out.println(list2);

        Collections.swap(list2, 0, list2.size()-1);
        System.out.println(list2);
        System.out.println(list2.get(0));
        System.out.println(list2.get(list2.size()-1));
        System.out.println(list2.set(0,200));
        System.out.println(list2);

        System.out.println("====================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "Elkem", "Anton", "Cristina"));
        names.removeIf(each -> each.equals("Ahmed"));
        System.out.println(names);

        System.out.println("==============================================");
        ArrayList<String> students = new ArrayList<>();

        students.retainAll(Arrays.asList("Askat", "Ziiadin"));

        System.out.println(students);



    }
}
