package day24;

public class Arrays_UniqueNumbers {
    public static void main(String[] args) {

        int[] arr = {1,1, 2, 3, 3, 6, 8, 9, 6, 4, 4, 1, 7, };
        /*
        1.verify if every element is unique or not
         */

        for(int j=0; j<=arr.length-1; j++){
        int num1 =  arr[j]; // 1
        int count  = 0;

        for(int i = 0; i<=arr.length-1; i++){
        int each = arr[i]; // 1 1 2 3 3
            //2.we need to find out how many times "each" matches with "num1"

            if(each == num1) {
                count++;
            }
            }

        if (count == 1) {
            System.out.println(num1);
        }
        }
        }
}
