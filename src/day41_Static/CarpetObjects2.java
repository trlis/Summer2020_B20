package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {

    /*

            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets

     */

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(4.5, 3.5, 17.5, false);
        carpets[1].customOrder(5.5, 3.5, 18.5, true);
        carpets[2].customOrder(4.5, 5.5, 19.5, false);
        carpets[3].customOrder(3.5, 4.5, 20.5, true);
        carpets[4].customOrder(6.5, 5.5, 21.5, true);
        /*
        for(Carpet each: carpets){
            each.getCarpetInfo();
            */


        ArrayList<Carpet> persianCarpet = new ArrayList<>();

        persianCarpet.addAll(Arrays.asList(carpets));
        persianCarpet.removeIf(each -> !each.isPersian);


        ArrayList<Carpet> regularCarpet = new ArrayList<>();
        regularCarpet.addAll(Arrays.asList(carpets));
        regularCarpet.removeAll(persianCarpet);

        System.out.println("Number of Persian carpets: " + persianCarpet);
        System.out.println("Number of regular carpets: " + regularCarpet);











    }
}
