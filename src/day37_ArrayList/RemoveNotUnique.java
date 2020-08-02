package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveNotUnique {
    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>();

       nums.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7));
                                  // returns frequency     !=1
        nums.removeIf( p -> Collections.frequency(nums, p) !=1);
                    // for the elements that are not unique

        System.out.println(nums);


    }
}
