package day16;

public class StringMethods_indexOf {
    public static void main(String[] args) {

        /*
        indexOf() : returns the first index number. s an int
         */

        //Always assign to the integers ( int )

        String str = "Cybertek";
        int IdxChar = str.indexOf("r");
        System.out.println(IdxChar);

        String sentence = "I like to stay in Cybertek, we are learning Java";
        int idxCh = sentence.indexOf("r");
        int idxCh1 = sentence.indexOf("re"); // returns the first chat 'r' index (are)
        int idxCh2 = sentence.indexOf("rn"); // returns the first chat 'r' index (arn)

        System.out.println(idxCh);
        System.out.println(idxCh1);
        System.out.println(idxCh2);


        System.out.println("============================================");


        //lastIndexOf( value: ): returns the last occured char. as an int

        String s6 = "Java is a programming language, and Java is fun";
        //           01234567890123456789012345678901234567890123456789
        //                    10         20        30        40
        int I1 = s6.indexOf("J"); //J ==> 0
        int I2 = s6.lastIndexOf("J");  //J ==> 36

        System.out.println(I1);
        System.out.println(I2);

        int I3 = s6.lastIndexOf("a");  //a ==> 39
        int I4 = s6.lastIndexOf("ag"); //a ==> 27
        int I5 = s6.lastIndexOf("ua"); //u ==> 26

        System.out.println(I3);
        System.out.println(I4);
        System.out.println(I5);






    }
}
