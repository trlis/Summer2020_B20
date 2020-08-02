package day07_unary_shortHand;

public class quiz {
    public static void main(String[] args) {
        int iNum = 100;
        double dNum = 200;
        float fNum = 300;

        // double -> float -> long -> int -> short -> byte


        //iNum = fNum;
        fNum = iNum;
        dNum = fNum;
        fNum = (float)(dNum);


        System.out.println("Result" + 0 + 1);
        System.out.println("Result B" + ( 1+ 2));

        long a = 30L;
        long b = (short) a;
        System.out.println(b);

    }
}
