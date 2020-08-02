package day15_String;
import java.lang.String;
public class StringMethods_SubString {
    public static void main(String[] args) {

     /* substring(): Creates the subString of the String
         1.substring(beg index, ending index) : creates the substring from the given beginning index
         till ending index(ending index will be excluded)

      */

        String sentence = "Java is fun";
        //                 0123456789.

        String word1 = sentence.substring(0,4);
        System.out.println(word1); //Java

        String word2 = sentence.substring(8, 10+1);
        word1 = word2;
        System.out.println(word1);//fun

        System.out.println("============================");
        String sentence2 = "I like Movies and TV Series";
        //                  0123456789....
        String movie = sentence2.substring(7, 13);
        System.out.println(movie);//Movies

        System.out.println("======================");
        String firstName = "LiSA";

        String firstLetter = firstName.substring(0,1);

        String rest = firstName.substring(1,firstName.length());
        System.out.println(rest);

        rest = rest.toLowerCase();

        firstName = firstLetter.toUpperCase() + rest.toLowerCase();
        System.out.println(firstName);







    }
}
