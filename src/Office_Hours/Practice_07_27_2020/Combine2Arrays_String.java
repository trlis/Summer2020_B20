package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combine2Arrays_String {
    public static void main(String[] args) {

        String[] a1 = {"I", "can", "become"};
        String[] a2 = {"whoever", "I", "want to"};
        String[] a3 = new String[a1.length + a2.length];

        int i = 0;

        for(String each: a1){
            a3[i] = each;
            i++;

        }
        for(String each2 : a2){
            a3[i] = each2;
            i++;
        }
        System.out.println(Arrays.toString(a3));



    }
}
