package day38_JavaRecap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Collection_utility {
    public static void main(String[] args) {


        /* Collections Class:
            Collections.sort()
            Collections.swap()
            Collections.frequency()
            Collections.max()
            Collections.min()
            Collections.replaceAll()

         */
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R', 'S', 'O', 'P', 'D', 'A', 'C'));
        System.out.println(chars);


        Collections.sort(chars);
        System.out.println(chars); //[A, C, D, O, P, R, S]

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Aslan", "Cristina", "Zeliha", "Iman", "Fatima", "Mohhamed"));

        Collections.swap(students, 1, 4 );
        Collections.swap(students, 1,4);
        Collections.swap(students, 0, students.size()-1);
        System.out.println(students); // [Aslan, Fatima, Zeliha, Iman, Cristina, Mohhamed]


        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Coffee", "Coffee", "Eggs", "Battery",  "Battery",  "Battery",  "Battery"));

        int count = Collections.frequency(items,  "Battery");
        System.out.println(count);


        System.out.println("=========== uniques ==========================");


        ArrayList<String> uniques = new ArrayList<>();


        for(String each: items) {
            int i = Collections.frequency(items, each);
            if (i == 1) ;
            uniques.add(each);
        }

            ArrayList<String> uniques2 = new ArrayList<>();

            uniques2.addAll(items);
            uniques2.removeIf(p -> Collections.frequency(uniques2, p) > 1);
            System.out.print(uniques2);
            System.out.println();


            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(10, 9, 89, 100, 2000, 3000, 30, 40, -50, 1000));

            Integer max= Collections.max(list);
            Integer min= Collections.min(list);

        System.out.println("max: " +max);
        System.out.println("min :" +min);

        Collections.replaceAll(list, 1000, 10000);
        System.out.println(list);





    }
}
