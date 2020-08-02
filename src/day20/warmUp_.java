package day20;

public class warmUp_ {
    public static void main(String[] args) {
        /*
        Tasks:
    1. write a program that can print the numbers between 1 to 100.
       if the number is divivible by 3, do not print it

         */

        for(int num = 1; num<= 100; num++){
            if(num%3 ==0){
                continue;
            }
            System.out.println(num);
        }


    }
}
