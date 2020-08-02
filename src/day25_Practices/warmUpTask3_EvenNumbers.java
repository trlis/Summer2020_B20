package day25_Practices;

import java.util.Arrays;

public class warmUpTask3_EvenNumbers {
    public static void main(String[] args) {
        /*
          3. Create an int array called numbers that has length of 100 and Assign 1-100 to each index of the array.
           then print out all the even numbers. MUST use continue statement
         */

        int[] numbers = new int [100];
        /*
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        .....
         */


        for(int n = 0; n <= numbers.length-1; n++) { // "n" represents index numbers
            numbers[n] = n + 1;
        }

            for (int each : numbers) {

                if (each % 2 != 0) {
                    continue;
                }
                    System.out.print(each + " ");
                }

            }
        }

