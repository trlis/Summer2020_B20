package day47_Encapsulations;

public class Test2 {

    static int a = 200;

    static{
        a =300;
    }

    public Test2(){ //Constructor will not be executed until it doesn't have an object
        a = 400;
    }

    public static void main(String[] args){
        new Test2();//400
        a=600;
        System.out.println(a); //300 => after object of the constructor is created: 400 => 600 - last initialization
    }
}
