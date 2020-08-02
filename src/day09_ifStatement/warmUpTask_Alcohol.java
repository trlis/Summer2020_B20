package day09_ifStatement;
/*
warmup tasks:

  4. write a java program that can identify if a person is eligible to buy alcohol
 */
public class warmUpTask_Alcohol {

    public static void main(String[] args) {


        boolean hasID = true;
        int age = 12;

        if(hasID && age >= 21){

            System.out.println("Eligible to buy alcohol");
        }
        if(!(hasID && age >= 21)){

            System.out.println("Not Eligible to buy alcohol");
        }

        System.out.println("========================");

        boolean eligible = hasID && age >= 21;

        if(eligible == true) {
            System.out.println("Eligible to buy alcohol");
        }
        if (eligible == false) {
            System.out.println("Not Eligible to buy alcohol");
        }


    }


}
