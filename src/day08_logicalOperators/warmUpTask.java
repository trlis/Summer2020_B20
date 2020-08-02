package day08_logicalOperators;
/* 1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragments:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;

 */
public class warmUpTask {

    public static void main(String[] args) {

        double gal = 15;
        double l = gal * 3.785;
        System.out.println(gal + " gallons equal to " + l + " litters");

        /*
         2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
         */

        double litters = 15;
        double gallons = litters / 3.785;
        System.out.println(litters + " litters equal to " + gallons + " gallons");


        /*

    3. manually calculate the following code fragments:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
      */

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //-200 + - 200 * 200 %2
        System.out.println(b);



        /*
         2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
         */

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        System.out.println(z);



    }


}
