package day18_ForLoop;

public class forLoop_PracticeName {
    public static void main(String[] args) {

        /*

        for( int l= 1; l<=5; l-- ){
                        if we keep decreasing value of l will always be less than 5, what makes the condition is true.
                        loop is gonna keep repeating infinite times
            System.out.println("Lisa");
         */

        /*
         for( int l= 0; l<=5; l++ ){ //l: 1, 2, 3, 4, 5, 6
            System.out.println("Lisa");
         */

        for (char l = 'A'; l <= 'Z'; l++) {
            System.out.print(l);

        }
        for (int num = 0; num <= 9; num++) {
            System.out.println(num + "\t\t\t\t\t\t " + num);
        }

        for (char s = 'A'; s <= 'Z'; s++) {
            System.out.print(s);
        }

        System.out.println("\n==============================");

        for(int i = 100; i >=1; i--){
            System.out.println(i);
        }
    }
}