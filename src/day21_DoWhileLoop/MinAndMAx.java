package day21_DoWhileLoop;
import java.util.Scanner;
public class MinAndMAx {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -999999999;
        int min = 999999999;
        for(int i = 1; i<=5; i++){
            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num>max){
                max = num;

            }
            if (num<min){
                min = num;
            }
        }
        System.out.println(max);
        System.out.println(min);


    }
}
