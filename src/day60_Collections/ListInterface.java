package day60_Collections;

import day54_Abstaraction_Intro.Car_Abstr_Task.Car;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class ListInterface {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>(); //METHODS: get, add, remove, set, removeAll, contains, size...
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("ArrayList: " + list1);
        System.out.println(list1.get(2));


        List<Integer> list2 = new LinkedList<>(); //METHODS: get, add, remove, set, removeAll, contains, size...
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("LinkedList: " + list2);
        System.out.println(list2.get(2));



      /*  List <Integer> list3 = new Vector<>();//METHODS: get, add, remove, set, removeAll, contains, size...
            list3.addAll(Arrays.asList(1,2,3,4,5));
            list3.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println("Vector: " + list3);
        System.out.println(list3.get(2));*/


        List<Integer> list4 = new Stack<>();//METHODS: get, add, remove, set, removeAll, contains, size...
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Stack: " + list4);
        System.out.println(list4.get(2));

        System.out.println("===================");

        int[] arr = {1, 2, 3, 4};
        int[][] arr2 = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}};

        ArrayList<String> l1 = new ArrayList<>();


        ArrayList<ArrayList<Integer>> l2 = new ArrayList<>();

        //l2.add("M")
        //l2.add(5)


        l2.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        l2.add(new ArrayList<>());

        l2.get(1).addAll(Arrays.asList(5, 6, 7, 8, 9));

        l2.get(0);


        System.out.println(l2);


        List<List<String>> group1 = new ArrayList();
        List<List<String>> group2 = new ArrayList();
        List<List<String>> group3 = new ArrayList();
        List<List<String>> group4 = new ArrayList();
        List<List<String>> group5 = new ArrayList();


        List<List<String>> groups = new ArrayList();
        groups.addAll(Arrays.asList(

              /* new ArrayList<>(),
               new ArrayList<>(),
               new ArrayList<>(),
               new ArrayList<>(),
               new ArrayList<>()*/

                new Stack<>(),
                new Stack<>(),
                new Stack<>(),
                new Stack<>(),
                new Stack<>()

        ));

        groups.get(0).addAll(Arrays.asList("Alexey", "Ana", "Ceren", "Kalbinur", "Busra O"));
        groups.get(1).addAll(Arrays.asList("Fatime", "Heydar", "Andrei", "Obi", "Busra Y"));
        groups.get(2).addAll(Arrays.asList("Shakhzod", "Husniddin", "Zeynep", "Ziiadin", "Paola"));
        groups.get(3).addAll(Arrays.asList("Nikolas", "Murat", "Alla", "Aalia", "Ali"));
        groups.get(4).addAll(Arrays.asList("Ashenafi", "Hamid", "Nikola", "Ayhan", "Esra"));


        for (List<String> eachGroup : groups) {
            System.out.println(((Stack) eachGroup).pop());
            System.out.println(eachGroup);
        }

        System.out.println(groups);


        //Get method - retrieving tha data


        List<Car> SUVs = new ArrayList<>();
        List<Car> sedans = new ArrayList<>();
        List<Car> truck = new ArrayList<>();
        List<Car> convertible = new ArrayList<>();

        List<List<Car>> cars = new ArrayList<>();

        /*cars.addAll(Arrays.asList(

            new ArrayList<>(); //
            new ArrayList<>();
            new ArrayList<>();
            new ArrayList<>();


        }*/

    }
}
