package day11_nestedIf_Ternary;

public class nestedIf_Practice2 {
    public static void main(String[] args) {

        int day = 7;
        boolean validNum = day >=1 && day <=7;

        String result = "";

        if(validNum){
            if(day == 7){
                result = "Sunday";
            }else if(day == 6){
                result = "Saturday";
            }else if ( day == 5){
                result = "Friday";
            }else if (day == 4){
                result = "Thursday";
            }else if (day == 3){
                result = "Wednesday";
            }else if (day == 4){
                result = "Tuesday";
            }else{
                result = "Monday";
            }

        }else{ // invalid number
            result = "Invalid";
        }
        System.out.println(result);

        System.out.println("=======================");

        if(validNum){
           result = (day == 1)? "Monday" : (day == 2)? "Tuesday" :( day == 3)? "Wednesday" : (day == 4)? "Thursday":
                   (day == 5)? "Friday" : (day == 6)? "Saturday": "Sunday";

        }else{
            result = "Invalid";
        }
        System.out.println(result);


    }





}

