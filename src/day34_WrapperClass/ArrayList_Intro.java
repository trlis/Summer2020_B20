package day34_WrapperClass;
import java.util.ArrayList;
public class ArrayList_Intro {
    public static void main(String[] args) {
        /*
        Array List: part of Collection
        *doesn't support primitive

        size is dynamic (automatically adjusted)

        has index numbers start from 0


        ArrayList <Datatype> name = new ArrayList <DataType>()
                   mandatory                       optional or the same with the mandatory DataType
        DataType can not be primitive

        ArrayList<int> scores = new ArrayList<int>() - compiler error because given DataType is primitive  -int

        We cant skip index numbers into the ArrayList


                ArrayList Methods:
              ----------------------
        add(Value):   adds element
        add(index, Value) : adds element to the specific elements. no skipping of the indexes

        get(index) : retrieves elements

        size()


        set():
        1.specify which element you want to set

        set(index, newElement): replaces the old element at given at given index with new element

        clear(): clears the list. sets the size to zero

        remove(int primitive): removes the element at the given index
        remove(non-primitive): first matching element will be removed from the list, only removes one
                              returns boolean






         */

        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(95); //autoBoxing  index:0
        scores.add(100);//            index:1
        scores.add(85); //            index:2
        scores.add(75);//             index:3
        scores.add(1,65);// 100 will be shifted to index 2, 85 => idx 3, 75=> idx 4
        //scores.add(7,55); Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 7, Size: 5
        //we have no elements at indexes 5 and 6
        //We cant skip index numbers into the ArrayList


        System.out.println(scores);

        System.out.println("================ get() ===================");
        System.out.println(scores.get(2));

        System.out.println("=============== size() ===================");
        System.out.println(scores.size());


    }

}
