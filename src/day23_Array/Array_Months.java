package day23_Array;
import java.util.Scanner;
public class Array_Months {
    public static void main(String[] args) {

        String months[] ={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number between 1-12");
        int n = input.nextInt();
        System.out.println(months[n-1]);




    }
}
