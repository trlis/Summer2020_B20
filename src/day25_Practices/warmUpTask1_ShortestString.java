package day25_Practices;

public class warmUpTask1_ShortestString {
    public static void main(String[] args) {

        // 1. Write a program that can return the longest string of text from a String array

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmemet"};

        int minLength = arr[0].length();
//1.Find out the minimum length of the shortest string from the array
        for(int i = 0; i<=arr.length-1; i++){ // to find out the min length of the string
            int l= arr[i].length(); // i=0 => length = 4;
                                    // i=1 => length = 8;
                                    // i=2 => length = 4;
                                    // i=3 => length = 8;
            if(l<minLength){
                minLength = l;
            }

        }
        System.out.println(minLength);
//2.Find out how many string's length in the array match with the minimum length
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i].length() == minLength){
                System.out.println(arr[i]);
            }
        }

    }

}
