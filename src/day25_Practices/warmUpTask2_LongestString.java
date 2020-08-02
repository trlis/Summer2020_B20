package day25_Practices;

public class warmUpTask2_LongestString {
    public static void main(String[] args) {
        //2. Write a program that can return the shortest string of text from a String array

        String[] arr = {"Nadir", "Asiya", "Kalbinur", "Muhtar", "Asil"};

        int maxLength = arr[0].length();

        for(String each : arr) {
            if (each.length() > maxLength) {
                maxLength = each.length();
            }
        }

         for(String each : arr) {
             if( each.length() == maxLength){
                 System.out.println(each);
             }

         }
            }
        }

