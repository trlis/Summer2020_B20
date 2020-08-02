package day29_CustomMethods;
/*
    11. wirte a method that can print out the maximum number from any array of integers
    12. wirte a method that can print out the minimum number from any array of integers
 */
public class Task11_MaxMinNum {
    public static void main(String[] args) {

        int[] numbers = {10, 9, 111, 2000, 3};
        maxNum(numbers);
        minNum(numbers);



    }

    public static void maxNum(int[] arr){

        int max= arr[0];
        for(int each : arr){
            if(each>max){
                max=each;
            }
        }
        System.out.println("Maximum number is: " + max);
    }
    public static void minNum(int[] arr2){

        int min =  arr2[0];
        for(int each2 : arr2){
            if(each2<min){
                min =each2;
            }
        }
        System.out.println("Minimum number is: " + min);



    }
}
