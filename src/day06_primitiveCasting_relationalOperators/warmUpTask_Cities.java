package day06_primitiveCasting_relationalOperators;
/*
    task01:
        Create a class named Cities
                Declare 3 String variables
                    city1
                    city2
                    city3
                Assign values:
                            Tashkent
                            Kyiv
                            Moscow
            Print: use the city variables
                    From Tashkent to Kyiv is $500
                    From Moscow to Tashkent is $550
                    I have been to Tashkent, Moscow, Kyiv.

 */
public class warmUpTask_Cities {

    public static void main(String[] args) {

        String city1 = "Tashkent";
        String city2 = "Kyiv";
        String city3 = "Moscow";
        int cost1 = 500;
        int cost2 = 550;

        System.out.println("From " + city1 + " to " + city2 + " is " + "$" + cost1);
        System.out.println("From " + city3 + " to " + city1 + " is " + "$" + cost2);
        System.out.println("I have been to " + city1 + ", " + city3 + ", " + city2 + ".");

    }
}
