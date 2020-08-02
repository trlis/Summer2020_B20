package day11_nestedIf_Ternary;
/*
      precondition : minimum salary of 30k
          sub condition : minimum 2 years of job history
       */
public class nestedIf_Practice1 {
    public static void main(String[] args) {

        double salary = 2000000;
        int jobHist = 1;

        String res = "";

        if (salary >= 30000) {

            if (jobHist >= 2) {
                res = "You are qualified";
            } else {
                res = "You must have at least 2 years of job history";
            }

        } else {
            res = "You MUST earn at least $30K";

        }
        System.out.println(res);
    }

}



