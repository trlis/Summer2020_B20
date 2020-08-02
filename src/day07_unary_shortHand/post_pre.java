package day07_unary_shortHand;

public class post_pre {

    public static void main(String[] args) {

        int l = 10;
        System.out.println(++l); //11
        System.out.println(l); //11

        System.out.println("");

        int b  = 10;
        System.out.println( b++); //10
        System.out.println(b); //11;

        System.out.println("");
        int c = 25;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        System.out.println("");

        int e = 25;
        e++;
        System.out.println(e);

        System.out.println("Task\n\n");

        int x1 = 2;
        int y1 = x1++;
        System.out.println(y1);


        int x2 = 2;
        System.out.println(x2++);

        int x3 = 2;
        System.out.println(--x3);

        int x4 = 8;
        int y4 = x4--;
        System.out.println(y4);
        System.out.println(x4);

        System.out.println("");
        System.out.println("Task 2");

        int a = 50;
        a = --a + a++ + a-- + a++;
        System.out.println(a);

        int x = 4;
        int y = x * 4 - x++;
        System.out.println(y);

        int A = 1;
        A = -A-- + A++ / -A-- * --A;
        //A =  -1  +  0  /  -1  *  -1
        System.out.println(A);

        int B  = 50;
        B = --B + B++ + B-- + B++;
        System.out.println(B);


    }
}
