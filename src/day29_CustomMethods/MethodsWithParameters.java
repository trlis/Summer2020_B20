package day29_CustomMethods;

public class MethodsWithParameters {
    public static void main(String[] args) {

        printHello(5);


        age(2000, 2020);



    }

    public static void printHello(int numOfTimes) {

        for (int i = 0; i < numOfTimes; i++) {
            System.out.println("Hello World");
        }

    }

    public static void age(int birthYear, int currentYear) {

        if (currentYear < birthYear) {
            System.out.println("Invalid entry");
        } else {

            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");

        }
    }


}
