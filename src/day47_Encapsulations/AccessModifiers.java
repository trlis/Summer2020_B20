package day47_Encapsulations;

public class AccessModifiers {

    public static int publicVariable = 100;

    public static void publicMethod(){
        System.out.println("public method");
    }

    //default
    static int defaultVariable = 200;

    static void defaultMethod(){
        System.out.println("Default method");
    }

    //private:
    private static  int privateVariable = 300;

    private static  void privateMethod(){
        System.out.println("private method");
    }
}
