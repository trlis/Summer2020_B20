package day47_Encapsulations;

public class Test {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable); //public is accessible from everywhere
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable); // default is accessible within the same package
        AccessModifiers.defaultMethod();

        //System.out.println(AccessModifiers.privateVariable); //private variable accessible only within the class

        Encapsulation obj1 = new Encapsulation();
        System.out.println("old SSN: "+obj1.getSsn());

        obj1.setSsn(1987654321);
        System.out.println("updated SSN : "+obj1.getSsn());


    }
}
