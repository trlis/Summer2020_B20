package day24;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {

        /*
        Arrays Utility:

                Arrays class
                => designed only for Arrays

                => presented in "java.util" package
                import java.util.(package name) Arrays(class)

      => Methods:

                Arrays.toString(arr): - converts array value to string

                Arrays.sort(arr): - sorts the array in the ascending order (from smallest to largest)
                DO NOT USE ON THE INTERVIEW

                Arrays.equals(arr1, arr2): compares 2 arrays that we have
                returns booleans


         */

        int[] arr = {1,2,3};
        //System.out.println(arr ); result => hash code
        System.out.println(Arrays.toString(arr)); //  result => [1, 2, 3]
        String s1 = Arrays.toString(arr);
        System.out.println(s1); //  result => [1, 2, 3]

        String[] students ={"Asil", "Andrei", "Kevser", "Kalbinur", "Fatih"};
        System.out.println(Arrays.toString(students)); //result => [Asil, Andrei, Kevser, Kalbinur, Fatih]

        int[] nums ={3, 9, 6 ,2 , 8 , 1 ,4 , 7 ,5};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Max num:" + nums[nums.length-1]);
        System.out.println("Min num:" + nums[0]);

        String names[] = {"Mehdi", "Elkem", "Mee", "Trump"};

        //["Elkem", "Mee", "Mehdi", "Trump"] - ascending order

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("=====================");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);
        int[] arr3 = {1, 2, 3};

        boolean r2 =Arrays.equals(arr2, arr3);
        System.out.println(r2);

        int[] arr4 = {1,1,2,3};
        int[] arr5 = {1,2,3};

        boolean r3 =Arrays.equals(arr4, arr5);
        System.out.println(r3);






    }
}
