package day34_WrapperClass;
import java.util.Scanner;
public class WrapperClassPractice2 {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i =1; i<=5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();


                if (num > max) {
                    max = num;
                }
                if(num<min){
                    min = num;
                }

            }
        System.out.println(min);

        System.out.println(max);


        }




    }

