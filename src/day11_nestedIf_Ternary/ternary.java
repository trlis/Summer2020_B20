package day11_nestedIf_Ternary;

public class ternary {
    public static void main(String[] args) {

        int num = 100;
        String res = "";

      /*  if ( num%2 == 0){
            res = "Even";
        }else{
            res = "Odd";
        }

       */

        String res2 = (num%2 ==0)?"Even" : "Odd";
        System.out.println(res2);

        System.out.println("====================================");

        int num1 = 10;
        int num2 = 20;
        int max1 = 0;

        /*if(num1 > num2){
            max1 = num1;
        }else{
            max1 = num2;
        }
        */
        max1 = (num1 > num2)? num1 : num2;
        System.out.println(max1);
        System.out.println("==========================================");

        int age = 45;
        boolean eligible = true;
       eligible = (age>=21)? eligible : !eligible;
        System.out.println(eligible);

        System.out.println("=============================================");
        int age1 = 14;
        boolean canVote = true;

        canVote = (age1 >= 21)? canVote: false;
        System.out.println(canVote);



    }


}
