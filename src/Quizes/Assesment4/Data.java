package Quizes.Assesment4;

public class Data {

    public void methodA(){
        System.out.println("Method A");
    }
}


class Test extends Data{
    /*
    instance method : 1
     */

    public void methodB(){
        System.out.println("Method B");
    }

    public static void main(String[] args) {

        Data obj = new Data();
        obj.methodA();
        //obj.methodB();
    }
}