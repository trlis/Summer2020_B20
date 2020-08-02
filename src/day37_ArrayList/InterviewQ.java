package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class InterviewQ {
    public static void main(String[] args) {

        //write a program that can remove all the names named 'Ahmed' from the list of Arrays.

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ahmed", "Muhtar", "Ahmed", "Virgnia", "Beslan", "Ibrahim", "Ahmed"));
        System.out.println(employees);
        employees.removeAll(Arrays.asList("Ahmed", "Dawud")); //[Muhtar, Virgnia, Beslan, Ibrahim]
        //employees.retainAll(Arrays.asList("Ahmed", "Dawud")); //[Ahmed, Ahmed, Ahmed]
        System.out.println(employees);


    }
}
