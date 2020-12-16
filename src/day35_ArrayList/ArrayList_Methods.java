package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

        //Set() method

        //remove (int index)
        ArrayList<String> earlyBird = new ArrayList<>();
        earlyBird.add("Ibrahim");
        earlyBird.add("Virginia");
        earlyBird.add("Ziiadin");
        earlyBird.add("Efran");
        earlyBird.add("Aailia");

        earlyBird.set(2, "Aslan");
        earlyBird.set(0, "Ian");
        System.out.println(earlyBird);

        earlyBird.clear();
        System.out.println(earlyBird);
        System.out.println("===========================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //0
        list.add(2); //1
        list.add(3); //2
        list.add(4); //3
        list.add(5); //4

        list.remove(1); //2-int ==> remove index from the array list, decrease array size
                                                                  // [1, 2, 3, 4, 5] => [1, 2, 4, 5]

        //list.remove(4); //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 4
                              // after removing index 2, the last index in the arraylist is 3

        System.out.println(list);
        System.out.println("================== remove(elements) =======================");

        //remove(elements)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1); //0
        list2.add(2); //1
        list2.add(3); //2
        list2.add(4); //3
        list2.add(5); //4

        int a = 1;
        list2.remove(a); //Element under index 0 in the Array
        System.out.println(list2);//  [1, 2, 3, 4, 5]==>[2, 3, 4, 5]

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hamit");
        list3.add("Lilia");
        list3.add("Musa");
        list3.add("Viorel");
        list3.add("Musa");

        if(list3.remove("Musa")){
            list3.remove("Kate");

        }
        System.out.println(list3);

        list3.remove(2);









    }


}
