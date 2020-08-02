package day29_CustomMethods;

public class WarmUps {
    public static void main(String[] args) {
        /*
         1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
         */

        String[] arr = {"A", "B", "B", "C"};

        for(String letter: arr){
            int count= 0;
            for(String each : arr){
                if(letter.equals(each)){
                    count++;
            }
        }
        if(count == 1){
            System.out.println(letter);

        }


        }
    }
}
