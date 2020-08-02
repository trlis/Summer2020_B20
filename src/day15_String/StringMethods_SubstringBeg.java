package day15_String;

public class StringMethods_SubstringBeg {
    public static void main(String[] args) {


        // substring(beg):
        String lastName = "Trasenko";
        String firstChar = lastName.substring(0,1); //T
        String remaining = lastName.substring(1); //rasenko

        System.out.println(firstChar);
        System.out.println(remaining);

        System.out.println("======================================");

        String lastN = "cYnthIA";
        String firstCh = lastN.substring(0,1);
        String remain = lastN.substring(1);

        lastN = firstCh.toUpperCase() + remain.toLowerCase();
        System.out.println(lastN);

        System.out.println("=======================");
        String gOT = "I like Game of Thrones";
        //            01234567
        String series = gOT.substring(7);
        System.out.println(series);

        System.out.println("================================");
        String s2 = "I like Java Programming Language";
        //           01234567

        String javaPL = s2.substring(7);
        System.out.println(javaPL);






    }
}
