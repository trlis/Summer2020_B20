package Library;

import day47_Encapsulations.AccessModifiers;

public class Test_AccessModifiers {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        //System.out.println(AccessModifiers.defaultVariable); default cant be called outside the package
        //AccessModifiers.defaultVariable();
        //this one from day 47

        //System.out.println(AccessModifiers.privateVariable);
        //AccessModifiers.privateMethod();
        //private cant be called neither from different class nor package
        }




    }

