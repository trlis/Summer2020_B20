package day19_forLoop_BreakStatement;

public class breakStatement {
    public static void main(String[] args) {

        //break statement: used for exiting switch and loops
        //if the condition is true the loop is going to repeat it for infinite times

        for(int i = 0; i<5; i++){
            System.out.println("hello");
            break;

        }

        for(char ch = 'A'; ch<='Z'; ch++) {
            System.out.print(ch + " ");
            if (ch == 'I') {
                break;
            }
        }

            System.out.println("\n==============================");
           for(int num = 10; num<=50; num +=10){//num: 10; 20; 30; 40; 50
               System.out.print(num + " ");
                   if(num == 30){

                       break;

                   }
               }

        {}
           for(int x = 1000; x >=100; x -= 100 ){//x: 1000, 900, 800, 700, 600, 500, 400, 300, 200, 100

               if(x == 500){
                   break;
               }
               System.out.print(x+ " "); //1000, 900, 800, 700, 600 - false, 500- true. 500 won't be printed

           }

           }
        }
