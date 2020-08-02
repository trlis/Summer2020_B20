package day29_CustomMethods;
/*
task:
    1. create a method that can print odd numbers between 1~100
    2. create a method that can print even numbers between 1~100

 */
public class MethodPractice {


    public static void main(String[] args) {

        oddNums();
        evenNums();

    }
    public static void oddNums() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            }
            System.out.println();

    }

            public static void evenNums(){

            for(int e=0; e<=100; e++) {
             if(e%2 ==0) {
                 System.out.print(e + " ");
             }
             }
                System.out.println();
        }
    }

