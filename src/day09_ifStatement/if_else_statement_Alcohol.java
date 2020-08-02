package day09_ifStatement;

public class if_else_statement_Alcohol {

    public static void main(String[] args) {

        int age = 21;
        boolean hasID = true;

        if(age >= 21 && hasID ){
            System.out.println("You can buy alcohol");
        } else {
            System.out.println("You can not buy alcohol");
        }
    }

}
