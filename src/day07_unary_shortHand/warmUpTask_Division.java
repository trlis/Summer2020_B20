package day07_unary_shortHand;
/*
2. write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
Collapse

 */
public class warmUpTask_Division {

    public static void main(String[] args) {

        int num = 65;

        boolean div2 = num%2 == 0;
        System.out.println(num + " is divisible by 2 :" + div2);

        boolean div3 = num%3 ==0;
        System.out.println(num + " is divisible by 3: " + div3);

        boolean div5 = num%5 ==0;
        System.out.println(num + "is divisible by 5: " + div5);


    }
}
