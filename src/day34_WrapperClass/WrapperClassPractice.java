package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClassPractice {
    public static void main(String[] args) {



        Integer[] arrInt = {1,2,3};
        for(Integer each: arrInt){
            System.out.println(each);

        }

        //Double[] dArr = {1,2,3,4}; // compiler error - int cant be assigned to Double from wrapper class
        double[] dArr = {1,2,3,4};
        Double[] arrD = {1.0,2.1,3.2,4.3};

        for(Double each: arrD){
            System.out.println(each);
        }

        char[] arrCh = {65,67,68,69};
        System.out.println(Arrays.toString(arrCh));

        char ch = 79;
        Character ch2 = 79;

        System.out.println(ch2);

        String[] nums1 = {"12", "13", "14", "15"};
        double[] nums2 = new double[nums1.length];

        for(int i =0; i<= nums1.length-1; i++){
           double eachN  = Double.parseDouble(nums1[i]);
            System.out.println(eachN);
        }





    }
}
