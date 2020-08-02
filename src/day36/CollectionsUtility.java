package day36;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsUtility {
    /*
    Arrays: utility class for the Arrays (imports automatically)
    Collections: utility for collection  (have to import)

    Array list part of the collection time
    ArrayList doesn't belong to Arrays,
    ArrayList is a collection type(part of the Collection)

    Collections methods:

        sort(): sorting the elements in the ascending order

     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(15);
        list.add(10);
        list.add(40);
        list.add(30);

        Collections.sort(list); //[10, 15, 20, 30, 40]

        System.out.println(list); // [20, 15, 10, 40, 30]

        System.out.println("Maximum Number: " + list.get(list.size()-1)); //Maximum Number: 40
        System.out.println("Minimum number: " + list.get(0)); //Minimum number: 10


        System.out.println("================ Swap(): =====================");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A"); //0
        list2.add("B"); //1
        list2.add("C"); //2
        list2.add("D"); //3
        list2.add("E"); //4

        System.out.println(list2); //[A, B, C, D, E]

        Collections.swap(list2, 1, 2);
        System.out.println(list2); //[A, C, B, D, E]

        Collections.swap(list2, 0, list2.size()-1);
        System.out.println(list2);// [E, C, B, D, A]

        System.out.println("============Frequency() =======================");

        ArrayList<Character> charList = new ArrayList<>();


        charList.add('A');
        charList.add('B');
        charList.add('A');
        charList.add('A');
        charList.add('A');
        charList.add('C');

        int count = Collections.frequency(charList, 'A'); // frequency - int
        System.out.println(count);










    }
}
