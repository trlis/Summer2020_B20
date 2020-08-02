package day07_unary_shortHand;

public class shortHandOperators {

    public static void main(String[] args) {



        int a = 200;
        a += 100; //300;
        System.out.println(a);


        int b = 200;
        b-= 100; //300
        System.out.println(b);

        int c = 50;
        c *= 3;
        System.out.println(c);

        System.out.println("==========================================");

        //+=:

        int z = 300;
        z += 200;
        System.out.println(z);

        String schoolName = "Cybertek";
        schoolName += " School";
        System.out.println(schoolName);

        String fullName = "Lisa";
        fullName += " Tarasenko";
        System.out.println(fullName);

        System.out.println("==============================");

        // /=:

        int budget = 10000;
        budget /=2;
        System.out.println(budget);


        // %=:

        int q = 10;
        q %= 2;
        System.out.println(q);

        int w = 150;
        w %= 45;
        System.out.println(w);






        System.out.println("_______________TASK________________");

        int i = 7;
        i +=8;
        System.out.println(i);

        int j = 8;
        j -=3;
        System.out.println(j);

        int k = 10;
        k *=2;
        System.out.println(k);

        int l = 10;
        l /=2;
        System.out.println(l);

        System.out.println("");

        int g = 195;
        boolean evenG = g%2 ==0;
        System.out.println(evenG);




    }
}
