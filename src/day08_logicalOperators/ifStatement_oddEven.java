package day08_logicalOperators;

public class ifStatement_oddEven {
    public static void main(String[] args) {

        int num = 30;
        boolean evenN = num % 2 == 0;
        boolean oddN = !evenN;
        if (evenN == true){
            System.out.println(num + " - The number is even");
        }
        if (oddN == true) {
            System.out.println(num + " The number is odd");
        }
    }
}
