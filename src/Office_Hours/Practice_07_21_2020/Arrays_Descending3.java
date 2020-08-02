package Office_Hours.Practice_07_21_2020;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Descending3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int size = input.nextInt();
        System.out.println("");

        int[] arr = new int[size];
        for(int i=0; i < size; i++){
            System.out.println("Enter a number: ");
           arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] descArr = new int[size]; //will contain the descending order of the original array

        int k = arr.length-1;
        for(int each : arr){
            descArr[k] = each;
            k--;
        }
        System.out.println(Arrays.toString(descArr));
    }
}
