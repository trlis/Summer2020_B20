package day43_Static;

public class static_vs_instance {

    static int staticVariable;
    int instanceVariable;

    public static void main(String[] args) {

        static_vs_instance obj1 = new static_vs_instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;


        static_vs_instance obj2 = new static_vs_instance();
        obj2.instanceVariable = 200;
        obj2.staticVariable = 400;

        System.out.println(obj1.instanceVariable);
        System.out.println(obj2.instanceVariable);

        System.out.println("===============================");
        System.out.println(obj1.staticVariable); //400
        System.out.println(obj2.staticVariable); //400

        System.out.println(static_vs_instance.staticVariable);



    }
}
