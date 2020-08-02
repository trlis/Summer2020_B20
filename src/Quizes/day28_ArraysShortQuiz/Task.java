package Quizes.day28_ArraysShortQuiz;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {


        System.out.println("=============== Question 3 =====================");
        char[] array = { 'D' , 'C', 'A', 'B'};
        Arrays.sort(array); //ABCD

        for( char each : array) {
            System.out.print(each + " "); // A B C D
            if (each == 'D') {
                continue;
            }
        }
            System.out.println(); // A B C

        System.out.println("========= Question 4 ================");

        int wd = 0;
        String[] days = { "sun", "mon", "wed", "sat"};
        for(int i = 0; i< days.length; i ++){

            switch (days[i]) { // sun wd(0)-1 ; mon wd(-1) +1 +2; wed wd(2) + 2; sat wd(4)-1 ==> 3

                case "sat":
                case "sun":
                    wd -= 1;
                    break;

                case "mon":
                    wd++;
                case "wed":
                    wd += 2;
            }

        }
        System.out.println(wd);//3

        System.out.println("============ Question 5 ===================");
        int[] num1 = new int[3];
        int[] num2 = {1,2,3,4,5};

        num1 = num2; //int[] num1 ={1,2,3,4,5};

        for(int i=0; i<num1.length; i++){
            System.out.print(num1[i]); //12345
        }

        System.out.println("============ Question 7 ================");

        int[] intArr = {15,30,45,60,75};

        intArr[2] = intArr[4]; //intArr[2] = 45;  intArr[4] = 75; ==> {15,30,75,60,75};

        intArr[4] =90; //intArr[4] = 75; ==> {15,30,75,60,90};

        System.out.println(Arrays.toString(intArr)); //{15,30,75,60,90};

        System.out.println("============ Question 8 ================");





        System.out.println("============ Question 9 ================");







    }
}
