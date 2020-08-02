package day11_nestedIf_Ternary;
/*
warmup task:
    1. write a java program that can convert numbers between 0 ~ 9 to words,
     if the number is greater than 9 or less than zero, out put should be "Invalid". 1 --> one etc.

    2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
 */
public class warmUpTask {
    public static void main(String[] args) {

        int num = 5;

        String result = "";

        if( num == 0){
            result = "Zero";
        }else if( num == 1){
            result = "One";
        }else if ( num == 2){
            result = "Two";
        }else if ( num == 3){
            result = "Three";
        }else if ( num == 4){
            result = "Four";
        }else if ( num == 5){
            result = "Five";
        }else if ( num == 6){
            result = "Six";
        }else if ( num == 7){
            result = "Seven";
        }else if( num == 8){
            result = "Eight";
        }else if( num == 9){
            result = "Nine";
        }else{
            result = "Invalid";
        }
        System.out.println( result);





        int monthNum = 9;

        String res = "";

        if (monthNum == 2 ){
            res = "28";
        }else if ( monthNum == 4 || monthNum == 6 ||monthNum == 9 || monthNum == 11){
            res = "30";
        }else if (monthNum > 12 || monthNum < 1){
            res = "Invalid";
        }else{
            res = "31";
        }
        System.out.println(res);



    }
}
