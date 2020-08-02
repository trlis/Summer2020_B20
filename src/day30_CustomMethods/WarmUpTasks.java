package day30_CustomMethods;
/*
warmUp tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop

 */


import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {

        System.out.println("=========== Task1 ===============");

        //Task 1
        maxNum(10, 20);
        System.out.println("=========== Task2 ===============");

        //Task2
        int[] arr ={5,2,3,4,5,6,4,7,0,-5,-54,-55,-5,54,-45};
        descendingOrder(arr);
        System.out.println("============ Task3 ==============");

        //Task3
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};
        combinedArrays(arr1, arr2);
        System.out.println("========== Task4 ===========");

        //Task4
        PosNegZero(100);
        PosNegZero(0);
        PosNegZero(-100);

        int[] ar = {-5,1,0,500,-100,200};
        for(int each:ar){
            PosNegZero(each);
        }



    }

    //Task1
    public static void maxNum(int num1, int num2) {

        if (num1 == num2) {
            System.out.println("Numbers are equal");
            return; //exits the method
        }

        if (num1 > num2) {
            System.out.println(num1 + " is maximum number");
        } else {
            System.out.println(num2 + " is maximum number");
        }


    }

    //Task2
    public static void descendingOrder(int[] arr) { //{10,9,20,30,5,6,7}

        Arrays.sort(arr); //{5,6,7,8,9,10,20,30}

        for(int i = arr.length-1; i>=0; i--){
            System.out.print( arr[i] + " "); // 30,20,10,9,8,7,6,5

        }
        System.out.println();



    }

    //Task3
    public static void combinedArrays(int[]arr1, int[] arr2){

     //{1,2,3}  {4,5,6} ==> {1,2,3,4,5,6}

        int[] arr3 =new int[arr1.length +arr2.length];
        int i =0;
        for(int each1:arr1){
          arr3[i] = each1;
          i++;
        }
        for (int each2: arr2){
            arr3[i] =each2;
            i++;
        }
        System.out.println(Arrays.toString(arr3));




    }

    //Task4
    public static void PosNegZero(int num){

        if(num > 0){
            System.out.println(num + " is positive");
        }else if(num<0){
            System.out.println(num + " is negative");
        }else{
            System.out.println(num + " is zero");
        }


    }

}


