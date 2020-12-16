package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Mercedes", "Infinity", "Tesla", "WV", "Lamborghini", "Lexus", "Tesla"));
                              //    0        1           2          3       4         5           6
        //remove Method- overloaded

        cars.remove(3);
        //cars.remove("Tesla");
        //cars.removeAll("Tesla") remove all belong to Bulk Operations, so work only for Collections
        //cars.removeAll(Arrays.asList(cars));


        //removeAll method - removes all the elements that are matching to the condition
        //cars.removeIf(p-> p.toLowerCase().contains("m"));

        //retainAll method -  removes all the elements that are NOT  matching to the condition
        //cars.retainAll(Arrays.asList("Tesla"));

        System.out.println(cars);

        System.out.println("============ contains(); containsAll(); =============================");


        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs", "Milk", "Paper Towels", "Toilet Paper", "Mango", "Orange", "Avocado", "Dragon Fruit"));
        System.out.println(groceryList);

        //pepsi
        boolean r1 = groceryList.contains("Pepsi");

        // Eggs, Milk, Orange
        boolean r2 = groceryList.containsAll(Arrays.asList("Eggs", "Milk", "Orange")); //true -contains all the elements

        // Eggs, Milk, Orange, Water
        boolean r3 = groceryList.containsAll(Arrays.asList("Eggs", "Milk", "Orange", "Water")); //false - doesn't contain one element from the list of elements


        System.out.println("Total Number of Items: " + groceryList.size());



        System.out.println("================ set(); ====================");


        //set the dragon fruit to apple
        // set method doesn't do any adjustments to the Array List

        groceryList.set(groceryList.size()-1, "Apple");
        System.out.println(groceryList); //[Eggs, Milk, Paper Towels, Toilet Paper, Mango, Orange, Avocado, Apple]

        groceryList.set(groceryList.indexOf("Paper Towels"), "Dish Washer");
        System.out.println(groceryList); //[Eggs, Milk, Dish Washer, Toilet Paper, Mango, Orange, Avocado, Apple]

        groceryList.clear();
        System.out.println(groceryList); //[] - size = 0












    }
}
