package day29_CustomMethods;
/*
4. check eligibility to vote
    5. check eligibility to buy alcohol
    5.1 create a method that can calculate two numbers: num1,operator, num2

 */
    public class Task5_Eligibility {

    public static void main(String[] args) {


      voteEligibility("Lisa Tarasenko", true, 21, "Trump");
      alcoholEligibility(true, 21);
      calculator(20, '+',6);



    }


    public static void voteEligibility(String name, boolean citizen, int age, String candidateName) {

        if (age > 0) {

            System.out.println(name);


            if (citizen  && age >= 21) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("You are not eligible to vote");
            }
        }else{
            System.out.println("Invalid entry");
        }

    }
    public static void alcoholEligibility(boolean HaveID, int age){

        if(age>0){

            if(age>=21 && HaveID){
                System.out.println("You can buy alcohol");
            }else{
                System.out.println("You are not eligible to buy alcohol");

            }

        }else{
            System.out.println("Invalid entry");
        }
    }

    public static void calculator(double num1, char operator, double num2){
        //   +  -  *  /  %

        switch (operator){

            case '+':
                System.out.println(num1 + " + " + num2 + " equals " + (num1+num2));
                break;

            case '-':
                System.out.println("Subtraction: " + (num1-num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1*num2));
                break;

            case '/':
                System.out.println("Division: " + (num1+num2));
                break;

            case '%':
                System.out.println("Remainder: " + (num1%num2));
                break;

            default:
                System.out.println("Invalid operator");


        }



    }
}
