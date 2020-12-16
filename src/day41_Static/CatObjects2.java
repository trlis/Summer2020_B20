package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {

        /*
     CatObjects:
            create 5 objects of Cat and store them into an array variable
            print out the information of every single cat
                    (DO NOT use getInfo method)
            ArrayList:
                maleCats
                femaleCats
                first approach: apply loop ( both for each loop and for loop)
                second approach: do not use loop
     */

    public static void main(String[] args) {


        Cat[] cat = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        cat[0].setInfoCat("Ruby", 2, 'F', "Red", "Persian");
        cat[1].setInfoCat("Sam", 2, 'M', "Red", "Sphynx");
        cat[2].setInfoCat("Judy", 2, 'F', "Brown", "Bengal");
        cat[3].setInfoCat("Tom", 2, 'M', "Grey", "British Shorthair");
        cat[4].setInfoCat("Lord", 2, 'M', "White", "Maine Coon");

        ArrayList<Cat> maleCat = new ArrayList<>();
        ArrayList<Cat> femaleCat = new ArrayList<>();

        maleCat.addAll(Arrays.asList(cat));
        maleCat.removeIf(each -> each.gender != 'M');

        femaleCat.addAll(Arrays.asList(cat));
        femaleCat.removeAll(maleCat);

        System.out.println(maleCat);
        System.out.println(femaleCat);





    }
}
