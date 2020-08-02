package day08_logicalOperators;

public class logicalOperators_practice1 {

    public static void main(String[] args) {

        int age = 19;
        String Citizenship = "USA";

        boolean eligibleToVote = age >= 18 && Citizenship == "USA";
        System.out.println(eligibleToVote);

        String firstName = "Lisa";
        String lastName = "Tarasenko";
        int Age = 20;
        String citizenship = "Russia";
        String citizenship2 = "USA";
        String citizenship3 = "Canada";
        Boolean citizen = citizenship == "USA" || citizenship2 =="USA" || citizenship3 =="USA";

        boolean voteEligibility = age >= 18 && citizen;

        System.out.println(firstName + " " + lastName + " is eligible to vote in the US: " + voteEligibility);

    }

}
