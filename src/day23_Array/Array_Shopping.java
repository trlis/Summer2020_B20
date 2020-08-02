package day23_Array;

public class Array_Shopping {
    public static void main(String[] args) {

        String[] shoppingList = new String[7];

        System.out.println("Shopping List :\n");
        shoppingList[0] = "Toilet Paper";
        shoppingList[1] = "Hand Sanitizer";
        shoppingList[4] = "Eggs";
        shoppingList[6] = "Corona Beer";
        shoppingList[2] = "Bread";
        shoppingList[3] = "Milk";
        shoppingList[5] = "Water";

        for(int l =0; l <= shoppingList.length-1; l ++){
            System.out.println(shoppingList[l]);
        }
    }
}
