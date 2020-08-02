package day11_nestedIf_Ternary;
/*
90 ~ 100 ==> A
80 ~ 89 ==> B
70 ~ 79 ==> C
60 ~ 69 ==> D
otherwise ==> F
 */
public class nestedIf {
    public static void main(String[] args) {

        int score = 102;
        String result = "";

        if (score >= 0 && score <= 100) {  // valid score

            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }

        }else {
            result = "Invalid";

        }
        System.out.println(result);

        System.out.println("====================================");

        /*
        precondition : minimum salary of 30k
            sub condition : minimum 2 years of job history
         */
         int salary = 30000;
         int jobHist = 5;

         String res = "";

         if (salary >= 30000) {



         }
    }
}