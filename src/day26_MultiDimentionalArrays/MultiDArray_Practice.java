package day26_MultiDimentionalArrays;


import java.util.Arrays;

public class MultiDArray_Practice {
    public static void main(String[] args) {
        /*
        Testers: {"Lilia", "Odina", "Cristina", "Elkem" }
        Dev: {"Ahmet", "Erfan", "Roza", "Sarah"}
        SM: {"Nurmamet"}
        PO: {"Nadir"}
        BA: {"Alex"}

        scrumTeam: Testers, Developers, SM, PO, BA

         */
        String[] testers = {"Lilia", "Odina", "Cristina", "Elkem" };
        String[] Developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] SM = {"Nurmamet"};
        String [] PO = {"Nadir"};
        String [] BA = {"Alex"};

        String[] testers2 = {"Irene", "Aslan", "Nazar"};


        String[][] scrumTeam = {testers, Developers, SM, PO, BA};
        System.out.println(Arrays.deepToString(scrumTeam)); //Scrum Team before replacement
        //[[Lilia, Odina, Cristina, Elkem], [Ahmet, Erfan, Roza, Sarah], [Nurmamet], [Nadir], [Alex]]

        scrumTeam[4][0] ="Adam"; //Alex replacement
        scrumTeam[1][2] = "Emine"; //Rosa Replacement
        scrumTeam[0] = testers2; //testers' team replacement
        scrumTeam[3][0] = "Zeki"; //PO replacement

        System.out.println(Arrays.deepToString(scrumTeam)); //Scrum Team after replacement
        //[[Zeki, Aslan, Nazar], [Ahmet, Erfan, Emine, Sarah], [Nurmamet], [Nadir], [Adam]]
        System.out.println("================================================================");

        for(String[] each: scrumTeam) {
            for (String name : each) {
                System.out.println(name);
            }
            System.out.println(Arrays.toString(each));

        }
        System.out.println("================================================");

        /*
        Print Numbers %3 %5
         */

        int[][] scores = {{10, 20, 30, 45}, {60, 55, 75, 105}, {93, 48, 125, 135, 13}};

        for(int[] each: scores){
           for(int nums : each){
               if(nums%3 ==0 || nums%5 ==0){
                   System.out.print(nums + " ");

               }
           }

        }
        System.out.println("============ 3D Arrays=============");

        /*
        3 dimensional array: contains 2D arrays
         */
        int[][] a1 = {{1,2},{3,4,5}};
        int[][] a2 = {{6,7},{8,9,10}};

        int[][][] arr3D = {{{1,2},{3,4,5}} , {{6,7},{8,9,10}}};
               // 1[] - index num of the 2D array
               // 2[] - index num of the 1D array
               // 3{} - index num of the elements






    }
}
