package day23_Array;

public class ArrayVariable {
    public static void main(String[] args) {
        /*
      3 main DATA STRUCTURES in Java are:

            -  1.Array
            -  2.Collection
            -  3.Map

      Stores multiple data within one variable
     =================================================================================================================
      Regular variable:

             Datatype        name     =     data
             int(datatype)  num(var)  =  1 (data)

             DataType decides what you can store into a variable

             String friends = "Cybertek", "Muhtar", "Nadir" - compiler error - can contain only one data.

     =================================================================================================================

      ARRAY variable can contain multiple data within one variable.

            size is fixed. max index number = index of the last data

           declare:
               DataType[] arrayName = { data1, data2, data3...}
         */

            //String students = "Muhtar" - contains only one data

             String[] student = {"Cybertek", "Muhtar", "Nadir", "Asiya"} ;
             //student = {"Muhtar", "Nadir", "Asiya"} ; -compiler error because size wasn't assigned

              String[] students = {"Cybertek", "Muhtar", "Nadir", "Asiya"} ;
             //index numbers:    // 0             1       2         3

        String  name1 = students[1];
        System.out.println(name1);

        String name3 = students[3];
        System.out.println(name3);

        System.out.println("\n========== Practice ============\n");

        int[] score = {85, 70, 95, 90, 100};
        // indexes:     0   1   2   3   4    - size 5

        String[] name = {"Mike", "Adam", "Tonny", "John", "Amy"};
        //  indexes:        0       1       2        3      4  - size 5


       for(int n =0; n<=4; n++)
        System.out.println( name[n] + " : " +score[n] );

        System.out.println("\n========== Practice 2 ============\n");

       String[] classmates = new String[5]; //size 5,

        //classmates[0] = "Fatih";
        classmates[2] = "Hazel";
        classmates[1] = "Viorel";
        classmates[3] = "Mary";
        classmates[4] = "Leya";

        System.out.println();
        for(int i = 0; i <=4; i++){
            System.out.println(classmates[i]); //if nothing is assigned prints "null"
        }

        /*length: returns the size of the array. total number of elements
          length() - String
          length -array

         */
        System.out.println("\n========== Practice 3=================\n");

        String[] teachers = new String[5]; //size 5,
        teachers[0] = "Muhtar";
        teachers[2] = "Nadir";
        teachers[1] = "Saim";
        teachers[3] = "Asiya";
        teachers[4] = "Genc";

        for(int t = 0; t <= teachers.length-1; t++) {
            System.out.println(teachers[t]);
        }

        System.out.println("\n========== Practice 3=================\n");

        String[] groceries = {"Bananas", "Strawberry", "Blueberry", "Ricotta", "Mangoes", "Pineapple" };
        int[] amount = {5, 1, 1, 2, 6, 1};

        System.out.println("Groceries  list\n");
        for(int g = 0; g<= groceries.length-1; g++)
        {
            System.out.println(groceries[g] + " - " + amount[g]);
            System.out.println(5+4 +"123");
        }






    }
}
