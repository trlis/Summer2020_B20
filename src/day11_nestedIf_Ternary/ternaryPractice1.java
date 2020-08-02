package day11_nestedIf_Ternary;

public class ternaryPractice1 {
    public static void main(String[] args) {
        int age = 23;
        String citizen = "USA";

        String  result = "";

        if(age>=21 && citizen == "USA"){
            result = "Can vote";
        }else{
            result = "Can not vote";
        }
        System.out.println(result);
        System.out.println("=================");
        String result2  = (age>=21 && citizen == "USA")? "Can vote": "Can not vote";
        System.out.println(result2);


        System.out.println("====================================");

        int num1 = 100;
        int num2 = 100;

        String r = (num1 == num2) ? "Equal" : "Not equal";
        System.out.println(r);
    }








}
