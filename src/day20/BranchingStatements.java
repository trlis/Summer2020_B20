package day20;

public class BranchingStatements {
    public static void main(String[] args) {

        char ch = 'a';
        while(ch <= 'e'){
            if(ch == 'c'){
                ch++;
                continue;

            }
            System.out.println(ch);
            ch++;

        }

        //system.exit(0): Terminates all the program

        if(true){
            System.out.println("Started");
            System.exit(0); //Stops JVM // break statement exits the loop, but doesn't stop the entire program
        }
        System.out.println("Done");

        // If Process finished with exit code 0( 0 means code is fine)

        boolean a = true;
        while(a){
            System.out.println("Testing started");
            //break;
            System.exit(0);
        }
        System.out.println("Completed");
    }
}
