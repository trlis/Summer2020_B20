package day28_Recap;

import java.util.Arrays;

public class MultiDArrays_Practice1 {
    public static void main(String[] args) {

        //3 one d arrays in one multi d arrays
        //nested for loop


        String[] group33 = {"Davut", "Dilara", "Nurmamet", "Nurbiye", "Pavlo", "Julaiti", "Virginia", "Zain", "Ali", "Etnick", "Aigul", "Mike", "Veola"};
        String[] group22 = {"Aiperi", "Aalia", "Rumiya", "Viorel", "Samir"};
        String[] group2 = {"Ali", "Anton", "Elif", "Filip", "Guljannat"};
        String[] group21 = {"Violeta", "Alla", "Adam", "Lilia"};
        String[] group17 = {"Elvira", "Zeliha", "Paban", "Asylkan", "Dilyar", "Roza", "Kamil", "Sedge"};


        String[][] Batch20 = {group33, group22, group2, group21, group17};

        for (int i = 0; i <= Batch20.length - 1; i++) {
            //System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j <= Batch20[i].length - 1; j++) {

                String eachStudent = Batch20[i][j];

                if(eachStudent.toLowerCase().contains("m"))
                System.out.print( eachStudent + " ");
            }
            System.out.println();

        }
    }
}
