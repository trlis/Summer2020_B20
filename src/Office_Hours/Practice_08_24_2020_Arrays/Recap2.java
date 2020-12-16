package Office_Hours.Practice_08_24_2020_Arrays;

import java.util.Arrays;

public class Recap2 {

    public static void main(String[] args) {

        int[] nums = {2,3,4,5,6,7,8};

        for(int each : nums){
            if(each%3 !=0) {
                continue;

            }
            System.out.println(each);
        }
        System.out.println("=======================================");
        String[] names= {"Mawlan", "Memetjan", "Nickolas", "Elkem", "Aysen"};

        for(String each: names){
            if(each.toLowerCase().contains("m")){
                System.out.println(each);
            }

            System.out.println("==============================");

            int[] arr3 = {89,36,22,5,46,4,1,55,333};
            Arrays.sort(arr3);
            System.out.println(Arrays.toString(arr3));

            System.out.println("===================================");

            String[] students = {"Ana", "Kalbi", "Asiya", "Muhtar","Nadir"};
            Arrays.sort(students);
            System.out.println(Arrays.toString(students));

        }
        System.out.println("===============================");
        int[] a = {1,2,3,4};
        int[] a1 = {1,2,3,4};

        System.out.println(Arrays.equals(a,a1));
    }
}
