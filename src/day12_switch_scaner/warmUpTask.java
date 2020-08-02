package day12_switch_scaner;
/*
Warmup tasks:
    1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            example:
                    n1 = -2
                    n2  = 2
                    n3  = 1
                output: "n2 is bigger"
            NOTE: DO NOT USE IF STATEMENT

 */
public class warmUpTask {
    public static void main(String[] args) {

        double n1 = 2;
        double n2 = 200;
        double n3 = 30;

        String result = (n1 > n2 && n1 > n3) ? "n1 is bigger" : (n2 > n1 && n2 > n3) ? "n2 is bigger" : "n3 is bigger";
        System.out.println(result);


        System.out.println("============ 2 TASK =================");
       /*
       2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
        */
        int age = 150;

        String res = "";

        if(age > 0 && age <= 150){

           res = (age <= 21)? "Teenager" : (age >= 21 && age <= 55)? " Adult" : "Senior";

        }else{
            res = "invalid";
        }
        System.out.println(res);

    }
}


