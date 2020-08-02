package day27_recap;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.Scanner;

public class TypesOfArrays_Practice {
    public static void main(String[] args) {

        /*
        Single dimensionalArray: a variable that contains elements()Collection of elements
             each element has index

        declare:
        DataType[] name = {data1, data2, data3} ;


        Multi-Dimensional Array: a variable that contains arrays
            each array has index

         */

        String[] names = {"Alina", "Nora", "Asiya"};
       // index:              0,      1      2

        System.out.println(names[1]);
        System.out.println("==================================================");

        for(int i =0; i<=names.length-1; i++){
            //if(names[i].charAt(0) != 'A'){
            if(!names[i].startsWith("A")){
                continue;
            }
            System.out.println(names[i]);

        }


        System.out.println("=========================================");

        //DataType[] name = new DataType[length]

        int[] numbers = new int[5]; // before assigning any values : [0, 0, 0, 0, 0]

        numbers[3] = 25;
        numbers[0]= 100;
        numbers[3]=300;



        /*
        default values:
                int, long, byte, short ==> 0
                float, double ==> 0.0
                String ==> null
                boolean ==> false


         */


        System.out.println(Arrays.toString(numbers));

        System.out.println("===============================================");
        Scanner input = new Scanner(System.in);
        System.out.println("How many names do you want to enter?");
        String[] students = new String[input.nextInt()];

        input.nextLine(); // take out the Enter in Scanner
        for(int i=0; i<= students.length-1; i++) {
            System.out.println("Enter a name");
            students[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(students));



    }
}
