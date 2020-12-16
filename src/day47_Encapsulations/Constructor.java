package day47_Encapsulations;

public class Constructor {

    static{
        System.out.println("static block");
    }
    public Constructor(int a){

        System.out.println("int arg");

    }
    public Constructor(double a){
        this(10); //print "int arg"
        System.out.println("double args");//print "double arg"

    }

    public static void main(String[] args) {
        //new Constructor();

        new Constructor(10.0);

    }

}
