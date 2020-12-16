package day37_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7,8));

        list.removeIf(p-> Collections.frequency(list, p) == 1);


        System.out.println(list);
        System.out.println("=============================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        names.removeIf(p->p.toLowerCase().charAt(0) != p.charAt(p.length()-1) );
        System.out.println(names);

        System.out.println("========================================");

        ArrayList<Integer>grades = new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,75,85,65,85,55,70,45,89,73,73,35,47,89));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); //90~100
        ArrayList<Integer> gradeOfB = new ArrayList<>();  //80~89
        ArrayList<Integer> gradeOfC = new ArrayList<>();  //70~79
        ArrayList<Integer> gradeOfD = new ArrayList<>();  //60~69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); //below 60

        gradeOfA.addAll(grades);

        gradeOfA.removeIf(p-> p<90 || p>100);
        System.out.println(gradeOfA);

        gradeOfB.addAll(grades);
        gradeOfB.removeIf(p-> p<80 || p>89);
        System.out.println(gradeOfB);

        gradeOfC.addAll(grades);
        gradeOfC.removeIf(p-> p<70 || p>79);
        System.out.println(gradeOfC);

        gradeOfD.addAll(grades);
        gradeOfD.removeIf(p-> p<60 || p>69);
        System.out.println(gradeOfD);

        gradeOfF.addAll(grades);
        gradeOfF.removeIf(p-> p>60);
        System.out.println(gradeOfF);



    }
}
