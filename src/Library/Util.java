package Library;

import java.util.Arrays;

public class Util {

    //STRING METHODS

    public static String removeDuplicates(String str) {

        String nonDup = "";
        for (String each : str.split("")) {

            if (!nonDup.contains(each)) {
                nonDup += each;

            }
        }
        return nonDup;
    }

    public static String reverse(String str) {

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;

    }
    //reverse a string and returns the value

    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }

        return count;
    }
    //find a frequency of char from a string and returns as an int

    public static String uniques(String str) {

        String uniques = ""; //"bd"
        for (char eachChar : str.toCharArray()) {
            int count = frequency(str, eachChar);
            if (count == 1) {
                uniques += eachChar;
            }


        }
        return uniques;
    }
    //returns the uniques from a string

    public static String frequencyOfChars(String str) {

        String expectedResult = "";// ===> ABC  ==> A3B4C4

        String nonDup = Util.removeDuplicates(str); //ABC


        for (char each : nonDup.toCharArray()) {
            int count = Util.frequency(str, each);
            expectedResult = "" + each + count;
            System.out.print(expectedResult);


        }
        return expectedResult;
    }
    //returns the frequency of every single character from a string





    //ARRAY METHODS

    public static String formatFullName(String firstN, String lastN) {


        firstN = firstN.substring(0, 1).toUpperCase() + firstN.substring(1).toLowerCase();
        lastN = lastN.substring(0, 1).toUpperCase() + lastN.substring(1).toLowerCase();

        String regularFormat = firstN + " " + lastN;

        return regularFormat;


    }
    //format first and last name to the regular format

    public static int maxNum(int[] arr) {

        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

    }
    //find and returns max number from the array

    public static Integer maxNum(Integer[] arr) {

        Integer max = arr[0];
        for (Integer each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

    }

    public static double maxNum(double[] arr) {

        double max = arr[0];
        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

    }

    public static Double maxNum(Double[] arr) {

        Double max = arr[0];
        for (Double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

    }



    public static int minNum(int[] arr2) {

        int min = arr2[0];
        for (int each2 : arr2) {
            if (each2 < min) {
                min = each2;

            }

        }
        return min;
    }
    //find and returns min number from the array

    public static Integer minNum(Integer[] arr2) {

        Integer min = arr2[0];
        for (Integer each2 : arr2) {
            if (each2 < min) {
                min = each2;

            }

        }
        return min;
    }

    public static double minNum(double[] arr2) {

        double min = arr2[0];
        for (double each2 : arr2) {
            if (each2 < min) {
                min = each2;

            }

        }
        return min;
    }

    public static Double minNum(Double[] arr2) {

        Double min = arr2[0];
        for (Double each2 : arr2) {
            if (each2 < min) {
                min = each2;

            }

        }
        return min;
    }




    public static String[] combineArrays(String[] arr1, String[] arr2) {

        //{1,2,3}  {4,5,6} ==> {1,2,3,4,5,6}

        String[] arr3 = new String[arr1.length + arr2.length];
        int i = 0;
        for (String each1 : arr1) {
            arr3[i] = each1;
            i++;
        }
        for (String each2 : arr2) {
            arr3[i] = each2;
            i++;
        }
        return arr3;
    }
    //combines two arrays and returns it as a String


    public static int[] combineArrays(int[] arr1, int[] arr2) {

        //{1,2,3}  {4,5,6} ==> {1,2,3,4,5,6}

        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each1 : arr1) {
            arr3[i] = each1;
            i++;
        }
        for (int each2 : arr2) {
            arr3[i] = each2;
            i++;
        }
        return arr3;
    }
    //combines two arrays and returns it as an int

    public static Integer[] combineArrays(Integer[] arr1, Integer[] arr2) {

        //{1,2,3}  {4,5,6} ==> {1,2,3,4,5,6}

        Integer[] arr3 = new Integer[arr1.length + arr2.length];
       Integer i = 0;
        for (Integer each1 : arr1) {
            arr3[i] = each1;
            i++;
        }
        for (Integer each2 : arr2) {
            arr3[i] = each2;
            i++;
        }
        return arr3;
    }


    public static double[] combineArrays(double[] arr1, double[] arr2) {

        //{1,2,3}  {4,5,6} ==> {1,2,3,4,5,6}

        double[] arr3 = new double[arr1.length + arr2.length];
        int i = 0;
        for (double each1 : arr1) {
            arr3[i] = each1;
            i++;
        }
        for (double each2 : arr2) {
            arr3[i] = each2;
            i++;
        }
        return arr3;
    }
    //combines two arrays and returns it as a double

    public static Double[] combineArrays(Double[] arr1, Double[] arr2) {

        //{1,2,3}  {4,5,6} ==> {1,2,3,4,5,6}

        Double[] arr3 = new Double[arr1.length + arr2.length];
        int i = 0;
        for (Double each1 : arr1) {
            arr3[i] = each1;
            i++;
        }
        for (Double each2 : arr2) {
            arr3[i] = each2;
            i++;
        }
        return arr3;
    }


    public static char[] combineArrays(char[] arr1, char[] arr2) {

        //{1,2,3}  {4,5,6} ==> {1,2,3,4,5,6}

        char[] arr3 = new char[arr1.length + arr2.length];
        char i = 0;
        for (char each1 : arr1) {
            arr3[i] = each1;
            i++;
        }
        for (char each2 : arr2) {
            arr3[i] = each2;
            i++;
        }
        return arr3;
    }
    //combines two arrays and returns it as a char

    public static Character[] combineArrays(Character[] arr1, Character[] arr2) {

        //{1,2,3}  {4,5,6} ==> {1,2,3,4,5,6}

        Character[] arr3 = new Character[arr1.length + arr2.length];
        int i = 0;
        for (Character each1 : arr1) {
            arr3[i] = each1;
            i++;
        }
        for (Character each2 : arr2) {
            arr3[i] = each2;
            i++;
        }
        return arr3;
    }



    public static int[] addElement(int arr[], int num){

        int[] arr2 = new int[arr.length+1];// [0, 0, 0, 0]
        arr2[arr2.length-1] =num; //[arr2.length-1] - index of the last num in the array to assign  "int num =10"(line16)


        int i =0;
        for(int each : arr){
            arr2 [i]= each;
            i++;
        }
        return arr2;


    }
    //inserts the element into the array


    public static int[] sortDesc(int[] arr) {
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length - 1];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
    //sorts int array in descending order


    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);

        double[] arr2 = new double[arr.length - 1];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
    //sorts double array in the descending order


    public static char[] descending(char[] arr) {
        Arrays.sort(arr);

        char[] arr2 = new char[arr.length - 1];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
    //sorts char array in the descending order


    public static String[] sortDesc(String[] arr) {
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length - 1];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
    //sorts String array in the descending order



    public static Integer[] sortDesc(Integer[] arr){
        Arrays.sort(arr);

        Integer[] arr2 = new Integer[arr.length - 1];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }

    public static Double[] sortDesc(Double[] arr){
        Arrays.sort(arr);

        Double[] arr2 = new Double[arr.length - 1];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }

    public static Character[] sortDesc(Character[] arr){
        Arrays.sort(arr);

        Character[] arr2 = new Character[arr.length - 1];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }






}





