package day11_nestedIf_Ternary;
/* 2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12

 */
public class daysInMonth {
    public static void main(String[] args) {

        int month = 25;
        boolean validNum = month >=1 && month <= 12;
        boolean days30 = month == 4 || month == 6 ||month == 9 || month == 11;

        String res = "";

        if (validNum){

            res = (month == 2)? "28 days": (days30)? "30 days": "31 days";

        }else{
            res = "Invalid";
        }
        System.out.println(res);


    }



}
