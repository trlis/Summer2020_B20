package day22_NestedLoop;

public class Shapes {
    public static void main(String[] args) {

/*



      *
      **
      ***
      ****
      *****
      ******
      *******

       *******
       ******
       *****
       ****
       ***
       **
       *

 */

        for(int i = 1; i <=7; i++){

            for(int j =1;  j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("\n=========\n");

        for(int n= 7; n>=1; n-- ){ //n: 7 6 5 4 3 2 1 -- rows

            for(int l=n; l>=1; l--){ //l: 7 6 5 4 3 2 1 -- "*"
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
