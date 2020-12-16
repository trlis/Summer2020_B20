package Quizes.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_ShortQuiz {

    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //list1.addAll(Arrays.asList(1,2,3));


       // int a = 1; //index
        Integer a=1; //Object

        boolean r1 =list1.remove(a);

        list1.remove(a);
        System.out.println(list1);
        System.out.println(r1);


        System.out.println("======================================");


        String[] names = {"Rob", "Bran", "Rick", "Bran"};
        ArrayList<String> nameList = new ArrayList<>();

        nameList.addAll(Arrays.asList(names));

        if(nameList.remove("Bran")){ //true, {"Rob", "Rick", "Rick" }
            nameList.remove("John"); // false
        }
        System.out.println(nameList); // ["Rob", "Rick", "Rick" ]

        System.out.println("=====================");

        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("green", "red", "blue", "yellow"));
        colors.add(3, "cyan");

        System.out.println("=============================");

        ArrayList<Integer> list = new ArrayList<>();
        Integer b = 1;
        System.out.println(list.remove(b)); //false

        System.out.println("====================");

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(1,2,3,4,5));

        //arrList.set(0, arrList.get(4)); //[5,2,3,4,5]
       // arrList.set(4, arrList.get(0)); //
        Collections.swap(arrList, 0, arrList.size()-1);
        System.out.println(arrList);

        System.out.println("===================");

        ArrayList<Character> charList = new ArrayList<>();
        for(char i = 'a'; i<='z'; i++){
            charList.add(i);
        }boolean result = list.containsAll(Arrays.asList('a', 'c', 'D'));
        System.out.println(result);//false

        System.out.println("====================================");

        ArrayList<Integer> numList = new ArrayList<>();
        numList.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for(Integer each : list){
            if(each%2 !=0){
                continue;
            }
            System.out.println(each + " ");
            break;
        }











    }
}
