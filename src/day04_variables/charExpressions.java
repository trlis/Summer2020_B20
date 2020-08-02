package day04_variables;

public class charExpressions {

    public static void main  (String[] args){

        char ch1 = 'A';
        System.out.println(ch1);

        char ch2 = '5';
        System.out.println(ch2);

        char char_h = 104;
        System.out.println(char_h);

        char charA = 65;
        System.out.println(charA);

        char char3 = 45646;
        char char4 = 45656;
        char char5 = 55654;

        System.out.println(char3 + char4 + char5);

        int result = char3 + char4;
        System.out.println(result);

        double d = char3 + char4;
        System.out.println(d);

        int num1 = 'A';
        System.out.println(num1);

        char c4 = 65 + 45;
        System.out.println(c4);

        char chinese = 4564 + 4565 + 5564;
        System.out.println(chinese);

        char c7 = '1'; //49
        System.out.println( c7 );
        System.out.println(c7 +  1); // 49 + 1 = 50

        int r1 = c7;
        System.out.println(r1); //int:49

        char chinese2 = 4564 + 4575 + 5564;
        System.out.println(chinese2);
        System.out.println("");

        char a2 = '@';
        char a3 = 64;
        System.out.println(a2);
        System.out.println(a3);
        System.out.println('@' + 64 );

    }
}
