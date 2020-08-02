package Quizes;

public class IfStatements_quiz {

    public static void main(String[] args) {

        // q2:

        int score = 0;
        if(score == 0){ //0 == 0 ==> true (statement gets executed)

            score += 50; // += - addition operator ==> score = score + 50; = 50;

        }

        if(score != 0) {
            //50 != 0 ==> true
            score += 50; // score == 100;
            System.out.println(score);
        }

        System.out.println("==================");

        //q3:

        char grade = 'A';

        boolean passed = grade == 'A' || grade =='B'; // A == A || A =! B ==> true A==A
        boolean passed2 = grade == 'C' || grade == 'D'; // A != C || A != D ==> false

        if (passed || passed2){
            //true || false ==> true
            System.out.println("You passed exam");
        }else{
            System.out.println("You failed");
        }

        System.out.println("==================");


        //q7:

        int num = 10;

        if(--num > 10){
            System.out.println("Hello Cybertek" + num);
        }else{
            System.out.println("Hello World " + num);
        }
        System.out.println("==================");
       // q9:

        boolean x = true;
        boolean y = !x == false; // true
        boolean z = y; //true

        if(x){
            System.out.println("Hello everybody");
        }
        if(y){
            System.out.println("Today is a great day");
        }
        if(z){
            System.out.println("We are going to improve");
        }

        System.out.println("=============");

        boolean a = true;
        boolean b = !a == false; // true
        boolean c = b; //true

        if(a){
            System.out.println("Hello everybody");
        }else if(b){
            System.out.println("Today is a great day");
        }else if (c){
            System.out.println("We are going to improve");
        }

        System.out.println("==================");

        //q10

        int X =10;
        int Y = X++;

        // Y = 10   X = 10

        System.out.println(Y++ + "" + X++ + "" + Y);
                         //10 + " " + 11 + " " + 11 ==> 10 11 11



    }
}
