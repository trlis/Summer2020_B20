package day14_Recap;
import java.util.Scanner;
/*
1. write a program that can calculate the grade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested IF

 */
public class warmUp2_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the score: ");

        int score = scan.nextInt();

        if(score>= 0 && score <= 100){

            if(score >=90 && score<= 100){
                System.out.println("Excellent");
            }else if(score >=80 && score<= 89){
                System.out.println("Great");
            }else if(score >=70 && score<= 79){
                System.out.println("Good");
            }else if(score >=60 && score<= 69){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");

            }

        }else{
            System.out.println("Invalid");
        }



    }
}
