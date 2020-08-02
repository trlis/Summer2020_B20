package Quizes.day28_ArraysShortQuiz;

public class loops {
    public static void main(String[] args) {

        int a = 0;

        while(a<= 6){ // a: 0. true, 1. a =2, 2.true a = 4, 3.true a = 6, 4.true a = 8, false
            a+=2;

            System.out.println("=====================");

            int i = 0;
            int j = 7;
            //          i< 6
            for(i = 0; i< j-1; i +=2){ // i: 0, 2, 4, 6
                System.out.print(i + " "); //0 2 4

            }
            System.out.println();
            System.out.println("=======================");

            for(int k =0; k<=4;){
                k++;
                System.out.print(k + ""); //1, 2, 3, 4, 5
            }
            System.out.println();

            System.out.println("==============================");

            String str = "Cybertek";
            str.concat("School"); // String is immutable. We cant change it. We can oly create a new one
            //str. not assigned so str still references to its first appearence
            str.toLowerCase();
            System.out.println(str); //"Cybertek"

            System.out.println("=========== Question 7 =============");




            System.out.println("============== Question 8 =================");

            int z = 5; //5+5+4+3+2+1 = 20
            for(int q= 5; q > 0; q--){
                z+=q;

            }

            System.out.println(z);

        }
    }
}
