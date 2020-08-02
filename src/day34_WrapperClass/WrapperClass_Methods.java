package day34_WrapperClass;

public class WrapperClass_Methods {
    public static void main(String[] args) {

        String str = "123" + 5;// ==> 123
        int k = Integer.parseInt(str);

        System.out.println(str);
        System.out.println(k+5);

        Double  k1 = Double.parseDouble("7.5");//primitive to wrapper class - autoboxing
        System.out.println(k1-0.5);

        String s1 = "true";
        boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(!b1);

        System.out.println("=============================");

        String s2 = "1000000.5";

       double d1 =Double.valueOf(s2);
        System.out.println(d1);

        String s3 = "FalSE";
        boolean b3 = Boolean.valueOf(s3); // unboxing
        System.out.println(b3);



    }
}
