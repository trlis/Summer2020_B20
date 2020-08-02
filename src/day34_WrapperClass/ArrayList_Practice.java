package day34_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice {
    public static void main(String[] args) {


        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for(int i = 0; i<=100; i++){
            if(i%2 == 0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }

        }
        System.out.println("Even numbers: " + evenList);
        System.out.println("Odd numbers: " + oddList);

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Mango");
        groceryList.add("Water");
        groceryList.add("Salad");
        groceryList.add("Ice Cream");
        groceryList.add("Eggs");

        for(int i = groceryList.size()-1; i>=0; i--){
            System.out.print(groceryList.get(i) + "   ");



        }
        System.out.println();
        for(String each: groceryList){
            System.out.println(each);
        }



    }
}
