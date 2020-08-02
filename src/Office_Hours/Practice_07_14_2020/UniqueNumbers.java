package Office_Hours.Practice_07_14_2020;
import java.util.Scanner;
public class UniqueNumbers {
    public static void main(String[] args) {


        int[] arr = {1,1,2,3,3, 5, 6, 6, 13};
        //1. retrieve every element from the array to check its frequency



        for(int eachNum : arr){ // eachNum does not represents index numbers, it represents the element itself

        int num = eachNum; //1 -  in order to find how many times it occured in the array we need to compare each num with
                          //      every other number in the array
        int count = 0; // for the frequency of num in the array

        for(int each : arr){ // each represents the elements

            //Whenever each == num we can assume that num occured in the array ==> count it towards the frequency

            if(each==num){
                count++;

            }
        }
        if(count == 1) {
            System.out.println(num);
        }

        }



    }


    }
