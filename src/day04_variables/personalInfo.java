package day04_variables;
/*
task:
    declare the following variables
    First Name
    Last Name
    SSN
    Gender
    Age
    Country
    isEmployed
 */
public class personalInfo {
    public static void main(String[] args){

        String firstName = "Lisa";
        String lastName = "Tarasenko";
        char gender = 'F';
        int age = 20;
        String country = "USA";
        String SSN = "123-45-6789";
        boolean notEmployed = true;
        boolean isEmployed = false;


        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Unemployed: " + notEmployed);
        System.out.println("SSN: " + SSN);



    }
}
