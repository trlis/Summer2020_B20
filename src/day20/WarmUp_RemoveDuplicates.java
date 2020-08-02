package day20;
import java.util.Scanner;
public class WarmUp_RemoveDuplicates {
    public static void main(String[] args) {
/*
write a program that can remove the duplicates from any given String
    ex:
    input:abcabcaabb
    output:abc
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine(); // atr = aabb // "ab
        //                                      0123

        String result = ""; // 1.a 2.b ==> ab

        for(int i = 0; i <= str.length()-1; i++) {
            String s = "" + str.charAt(i); // 1.a 2.a 3.b 4.b => aabb  //str.substring(i, i+1)
            if (!result.contains(s)) { // if the character is already contained in result, we will not execute it
                result += s;
            }
        }
            System.out.println(result);
        }
        //Nested if









    }

