package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(30,20,56,78,98,100,20,0,-1,-3,400,500,5000));

        //maximum number:

       Integer max = Collections.max(list);
       Integer min =Collections.min(list);
        System.out.println("Max num: " + max);
        System.out.println("Min num: " + min);

        System.out.println("=================== replaceAll(): ========================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Muhtar", "Saim", "Asiya", "Muhtar", "Islem")) ;//replace Muhtar name to Fatima
    //Arrays.asList => convert Array to an ArrayList(Collection Type)

        Collections.replaceAll(names, "Muhtar", "Fatima");
        System.out.println(names);



    }
}
