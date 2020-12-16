package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {
    /*
     CatObjects:
            create 5 objects of Cat and store them into an array variable
            print out the informations of every single cat
                    (DO NOT use getInfo method)
            ArrayList:
                maleCats
                femaleCats
                first approach: apply loop ( both for each loop and for loop)
                second approach: do not use loop
     */

    public static void main(String[] args) {


        Cat[] cat = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        cat[0].setInfoCat("Ruby", 3, 'F', "Red", "Persian");
        cat[1].setInfoCat("Sam", 2, 'M', "Grey", "Sphynx");
        cat[2].setInfoCat("Judy", 1, 'F', "Brown", "Bengal");
        cat[3].setInfoCat("Tom", 6, 'M', "Grey", "American Shorthair");
        cat[4].setInfoCat("Lord", 8, 'M', "White", "Maine Coon");


        ArrayList<Cat> maleCat = new ArrayList<>();
        ArrayList<Cat> femaleCat = new ArrayList<>();


       /* for(int i =0; i<= cat.length-1; i++){
            if(cat[i].gender == 'M'){
                maleCat.add(cat[i]);
            }else{
                femaleCat.add(cat[i]);

            }
        }

        */

        for(Cat each: cat){
            if(each.gender == 'M'){
                maleCat.add(each);
            }else {
                femaleCat.add(each);
            }
        }

       System.out.println(maleCat);
        System.out.println(femaleCat);












    }
}
