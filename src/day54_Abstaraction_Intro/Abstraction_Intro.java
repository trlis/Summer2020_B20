package day54_Abstaraction_Intro;

public class Abstraction_Intro {
    /*Abstraction is Ability to hide implementation details of method

    ONLY concentration on essentials/ important things
    we only know what it does, but we don't know how its done


   shape: not specific ==> abstract
      area();



    circle:
       attributes: r
       area():
         r*r*PI

    square:
        attribute: a
        area();
             a*a


     rectangle:
            attributes: w,l
            area():
                w*l


     triangle:
            attributes: b, h
            area():
                 b*h*0.5


Ex2:

    car: abstract
            start();

    BMW
        start(): push start button

    Tesla
        start(): voice control

    Toyota
        start(): insert the key

    Jeep
        start(): jump start


   Abstract method: a method without implementation   (does not have a body)
                    a method that meant to be overridden (CANNOT BE FINAL /STATIC / PRIVATE)

       Access - Modifier   abstract    Return_type    methodName(Parameter);
       (none private)        MUST         MUST

       public static double area();

       abstract class: meant to bre a super class (cannot be final class, because final is meant to be sub class ONLY)
                       MUSt be able to inherit
                       not concrete class (cannot create an object)
       abstract = overriden(Abstract meant to be overridden)
       final != overriden (final cannot not be overridden)




    */
}
