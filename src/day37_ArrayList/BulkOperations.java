package day37_ArrayList;

import com.sun.corba.se.spi.orbutil.threadpool.NoSuchThreadPoolException;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

       boolean r1 =  list.contains(1); //true
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(4);

        boolean r2 = list.containsAll(elements);
        System.out.println(r2);

        System.out.println("=====================================");


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        ///verify that 1,2,4 are contained in the list 2




        boolean r3 = list.containsAll( Arrays.asList(1,2,4) );
       // boolean r3 = list.containsAll( Arrays.asList(1,20,4) ); false(20 is not in the list)
        System.out.println(r3); //true

        //containsAll  accepts only Collection type
       // Arrays.asList takes non primitive Array or array of values and returns COLLECTION TYPE

        System.out.println("=================================================================");

        ArrayList<Integer> numbers = new ArrayList<>();
        //add: 30,25,40,15,55,65,75,85,95,100

        Integer[] nums = {30, 25, 40, 15, 55, 65, 75, 85, 95, 100};

        numbers.addAll( Arrays.asList(nums));
        System.out.println(numbers);

        System.out.println("=======================  removeAll(): ===========================");



        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.addAll(Arrays.asList(1,1,1,1,1,2,2,3,4,5,5,6,7,8,9,10,11,12,13));
        System.out.println(numbs);

        numbs.removeAll(Arrays.asList(1,2,5,11));
        System.out.println(numbs);

        System.out.println("=======================  retainAll(): ===========================");

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,2,3,4,4,5,5,6,6,7,7,8,8,9));
        System.out.println(num1);
        //only keep the elements that ar either 1 or 2 or 3 or 9

        num1.retainAll(Arrays.asList(1,2,3,9));
        System.out.println(num1);






    }
}
