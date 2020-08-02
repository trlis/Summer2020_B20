package day08_logicalOperators;

public class logicalOperators_practice2 {

    public static void main(String[] args) {

        String firstName = "Lisa";
        String lastName = "Tarasenko";
        int age = 20;
        String citezen1 = "USA";
        String citizen2 = "Russia";
        String citizen3 = "Canada";
        boolean eligibleAge = age>=18;
        boolean usCitizen = citezen1 == "USA" || citizen2 == "USA" || citizen3 == "USA";
        boolean voteEligibility = eligibleAge && usCitizen;
        System.out.println(firstName + " " + lastName + " is eligible to vote in the USA: " + voteEligibility);

        System.out.println("I am " + "\"" +  firstName + "\"" );


    }
}
