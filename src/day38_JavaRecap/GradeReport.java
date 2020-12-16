package day38_JavaRecap;
import java.util.ArrayList;
import  java.util.Arrays;
import java.util.function.Predicate;

import day34_WrapperClass.ArrayList_Intro;
import org.omg.CORBA.INTERNAL;

public class GradeReport {
    public static void main(String[] args) {

        /*
        First store all the grades
        remove the grades that are not A
        only retain the grades of A etc
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,90,85,75,55,45,73,85,88,65,71,99));

        ArrayList<Integer> gradeA = new ArrayList<>(); //90~100
        gradeA.addAll(list);
        gradeA.removeIf(each -> each<90);
        System.out.println("Grade A: " + gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf(each -> each < 80 || each > 90); //use || operator because there is no such a number
        System.out.println("Grade B: " + gradeB);        //that is < 80 and > 90 at the same time

        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(each -> each<70 || each >80);
        System.out.println("Grade C: " + gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(each -> each<60 || each>70);
        System.out.println("Grade D: " + gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
        System.out.println("Grade F: " + gradeF);


        System.out.println("=====================================================");
        System.out.println(gradeA.size() + " students made A");
        System.out.println(gradeB.size() + " students made B");
        System.out.println(gradeC.size() + " students made C");
        System.out.println(gradeD.size() + " students made D");
        System.out.println(gradeF.size() + " students failed");




    }
}
