package day44_Constructor;


import day47_Encapsulations.Constructor;

public class Constructor_Intro {


// Access-modifier className(parameters) {}
    public Constructor_Intro(String arr) { //constructor with the parameter(argument of int )
        System.out.println("Hello " + arr); //1
        System.out.println("How are you");//3

    }

    public static void main(String[] args) {

        //Constructor_Intro obj = new Constructor_Intro(10);

        //Constructor_Intro obj2 = new Constructor_Intro();

        Constructor_Intro obj3 = new Constructor_Intro("Ivette");//2
        Constructor_Intro obj4 = new Constructor_Intro("Lien");
        Constructor_Intro obj5  =new Constructor_Intro("Shana");

    }
}