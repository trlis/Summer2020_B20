package day31_CustomMethodsRecap;

public class Methods_Practice {
    public static void main(String[] args) {


        max(5, 10);
        int maxN = maxNum(8, 14);
        System.out.println(maxN);


    }

    public static int maxNum(int num1, int num2) {

        int maxNUM = num1>num2? num1:num2;
        return maxNUM;

    }

    public static void max(int a, int b){
        int max = a>b? a:b;
        System.out.println(max);

    }
}
