package day62_Maps;

import java.util.*;

public class FrequencyOfChars {
    /*
    1. Write a program that stores the the character and frequency of each character from a String in to a Map

    Ex: "aaabbbccb"
    output:
        {a=3, b=4, c=2}
     */
    public static void main(String[] args) {

        String str = "aaabbbccb"; // a3b4c2
        Map<String,Integer> map = new LinkedHashMap<>();

        List<String> list = Arrays.asList(str.split("") );
        //System.out.println(list);//[a, a, a, b, b, b, c, c, b]

        for(String each : list){

            int frequency = Collections.frequency(list,each);
            map.put(each, Collections.frequency(list, each));
        }
        System.out.println(map);
    }
}
