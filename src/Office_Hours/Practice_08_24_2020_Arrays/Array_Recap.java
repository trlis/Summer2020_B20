package Office_Hours.Practice_08_24_2020_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Recap {

    public static void main(String[] args) {


        int[] arr1 = new int[5];

        arr1[0] = 10;
        arr1[arr1.length-1] = 20;
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[4] * arr2[1]);

        System.out.println(arr2[0] * arr2[arr2.length-1]);

        System.out.println("=====================================");

        Scanner input = new Scanner(System.in);
        String[] names = new String [5];
/*
        for(int i = 0; i<=4; i++) {
            System.out.println("Enter a name:");
            names[i] = input.nextLine();
        }

            System.out.println(Arrays.toString(names));

 */

        for(int i = 4; i>=0; i--){
            System.out.println("Enter a name ");
            names[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(names));
        }
    }
