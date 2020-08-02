package day35_ArrayList;

import java.util.ArrayList;

public class WarmUp3 {
    /*



    3. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};

if its a class we don't need to string method. it called automatically
We need Arrays.toString Method if its not a class
     */
    public static void main(String[] args) {
        String[] group1 = {"Alia", "Mohammed", "Aslan", "Ernis"};
        String[] group2 = {"Aaila", "Mohammed", "Aslan", "Ernis"};

        ArrayList<String> studentList =new ArrayList<>();

        for(String each1 : group1){
            studentList.add(each1);
        }
        for(String each2 : group2){
            studentList.add(each2);

        }
        System.out.println(studentList);

    }
}
