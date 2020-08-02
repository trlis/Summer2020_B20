package day06_primitiveCasting_relationalOperators;
/*
      9 > 8 ==> true
      7 < 6 ==> false
      7 >= 7 ==> true
      8 >= 6 ==> true
      9 <= 25 ==> true

      10 == 10 ==> true
      true == false ==> false
      'A' == 'A' ==> true
      "Muhtar" == "Good Guy" ==> false
      9 != 10 ==> true  (!= ==> not equal)
       */

public class relationalOperators {
    public static void main(String[] args) {

        boolean r1 = 10 > 9;
        System.out.println(r1);

        boolean r2 = 100 < 9000;
        System.out.println("r2 " + r2);


        //>=

        boolean r3 = 87 >= 85;
        System.out.println("r3 " + r3);

        boolean r4 = 877 >= 879;
        System.out.println("r4" + r4);

        //<=

        boolean r5 = 200 <= 300;
        System.out.println("r5 " + r5);

        //== : equal

        boolean r6 = 900 == 800;
        System.out.println(r6);

        boolean r7 = true == false;
        System.out.println(r7);

        boolean r8 = "Muhtar" == "Good Guy";
        System.out.println(r8);

        boolean r9 = "Muhtar" == "MUHTAR";
        System.out.println(r9);

        // boolean r10 = "123" == 123 - not compiles; DataType have to be the same!

        boolean result1 = 'A' == 65;
        System.out.println(result1);

        boolean result2 = 'A' == 65 + 1 +2;
        System.out.println(result1);

        boolean result3 = 100 == 100.0;
        System.out.println(result3);

        boolean result4 = 10 == (int)10.9999;
        System.out.println(result4);


        // != -> not equal

        boolean r11 = "Muhtar" != "Bad Guy";
        System.out.println("r11 " + r11);

        boolean r12 = true != false;
        System.out.println("r12 " + r12);

        System.out.println("======================================");

        int num = 100;
        boolean even = num%2 == 0;
        System.out.println(even);


        int num1 = 101;
        boolean odd = num%2 != 0;
        System.out.println(even);

        int x = 1000;
        boolean devis3 = x%3 == 0;
        boolean devis5 = x%5 == 0;
        boolean devis10 = x%10== 0;
        System.out.println(devis3);
        System.out.println(devis5);
        System.out.println(devis10);


    }
}
