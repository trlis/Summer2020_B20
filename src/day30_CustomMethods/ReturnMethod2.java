package day30_CustomMethods;

public class ReturnMethod2 {
    public static void main(String[] args) {


        String str1 = " Hello World";
        String str2 = "level";
        revStr1(str1);

       String reversedStr1 = revStr2(str1);
        System.out.println(str1.equalsIgnoreCase(reversedStr1));
        String reversedStr2 = revStr2(str2);
        System.out.println(str2.equalsIgnoreCase(reversedStr2));

    }

    public static void revStr1(String str1) {

        String result = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            char eachChar = str1.charAt(i);
            result += eachChar;
        }
        System.out.println(result);


    }


    public static String revStr2(String str2) {

        String result ="";
        for (int i = str2.length() - 1; i >= 0; i--) {
            char eachChar = str2.charAt(i);
            result += eachChar;
        }
        return  result;



    }



}
