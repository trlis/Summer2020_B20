package day25_Practices;

public class warmUpTask5_FirstThreeChars {
    public static void main(String[] args) {
         /*
         5. Write a program that will take five Strings and save them into an array called arr.
        and  Use for loop to print out the first three letter of each element of arr, one per line.

                   You can assume that every element of arr is at least 3 letters long.
                        Example: arr -> ["apple", "banana"]
                               prints:  appban

         */

        String[] words = {"Apple", "Banana", "Strawberry", "Java", "Python"};
/*
        System.out.println(words[0].substring(0,3));
        System.out.println(words[1].substring(0,3));
        System.out.println(words[2].substring(0,3));
        System.out.println(words[3].substring(0,3));

 */
        for(int i = 0; i<= words.length-1; i++){
            System.out.print(words[i].substring(0,3));
            System.out.println();
        }
        System.out.println("====================================================");
        for(String each : words){
            System.out.print(each.substring(0,3));
        }
    }
}
