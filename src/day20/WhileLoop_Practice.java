package day20;

public class WhileLoop_Practice {
    public static void main(String[] args) {

       /*
        for(int i = 1; i <= 10; i++){
            System.out.println(i + "");
        }
        System.out.println();
*/
        int num = 1;
        while(num<=10){
            //num++;  ==> 2 3 4 5 6 7 8 9 11
            System.out.print(num + " ");
            num++; //iterator(without it, statement is infinite)

        }
    }

}
