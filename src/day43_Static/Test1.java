package day43_Static;

import java.util.Arrays;
import static Library.Resources.a;

public class Test1 {

    public static void main(String[] args) {
        System.out.println(StaticBlock3.a); //will not be initialized
        System.out.println(StaticBlock3.b); //will not be initialized
        System.out.println(StaticBlock3.c); //will not be initialized

        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);



        System.out.println("=================================");
        System.out.println(a);

    }
}
