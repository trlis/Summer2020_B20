package Tasks;

public class AverageNumFromIntArray {
    /*
     3. Write a program that can return the average number from an array of integers
    ex:
            [1,2,3]
    average: 2
            [10, 15, 5, 6]
    average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]
    average: 10
            10/3  ==> 3
            10/3.0 ==> 3.333
            10/(double)3  == > 3.333...
*/

    public static void main(String[] args) {

        int sum = 0;
        int[] arr = {15,20,5,10,0,70};


        for(int i=0; i<= arr.length-1; i++){
            sum+=arr[i];
        }
        double average = sum/ arr.length;
        System.out.println(average);

    }

}
