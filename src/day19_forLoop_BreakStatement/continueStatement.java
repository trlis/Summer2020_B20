package day19_forLoop_BreakStatement;

public class continueStatement {
    public static void main(String[] args) {
        //continue statement: skips the current iteration and jumps to the next iteration

        for (int i = 1; i <= 5; i++) { // 5 iterations i: 1,2,3,4,5
            if (i == 3) {
                continue;
            }
            System.out.print(i + " "); // 1, 2 , (skips 3 -will not be printed), 4, 5

        }

        System.out.println("========================");

        for (char ch = 'A'; ch <= 'F'; ch++) {
            if (ch == 'C' || ch == 'B') {
                continue;
            }
            System.out.print(ch + " ");
        }
        System.out.println("\n============================");

        //print even numbers between 1 to 50;

        for(int even = 1; even <=50; even +=1){
        if(even%2 == 1){
            continue;
        }
            System.out.print(even + " ");
        }
        System.out.println("\n==================================");

        for(int odd = 1; odd <=50; odd+=2 ){
            if(odd%2 == 0){
                continue;
            }
            System.out.print(odd + " ");
        }



    }
}
