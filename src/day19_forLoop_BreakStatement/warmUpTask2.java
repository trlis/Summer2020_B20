package day19_forLoop_BreakStatement;

/*/


    2.  print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
    3. print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
            Hint: in the loop body , only place the statements that you need to repeat
8

 */
public class warmUpTask2 {
    public static void main(String[] args) {

        for( int num = 1; num  <= 8; num++ ){
            System.out.println(" * * * * * * ");
        }

        System.out.println("==========================\n");

        for( int num = 1; num <= 6; num++){
             System.out.print("* ");
        }
    }
}
