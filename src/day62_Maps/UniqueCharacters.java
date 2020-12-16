package day62_Maps;

import java.util.*;

public class UniqueCharacters {

    /*
    2. write a program that stores the unique characters from a string into map:

        Ex: "abacbdeef";
        output:
            {c=1, d=1, f=1}

     */

    public static void main(String[] args) {

        String str ="abacbdbaplpxlpejeef";
        Map<String, Integer> map = new LinkedHashMap<>(); //{c=1, d=1, f=1}

        List<String> list = Arrays.asList(str.split(""));


        for(String each : list){
            if(Collections.frequency(list, each)==1){
                map.put(each,1);
            }
        }
        System.out.println(map);

        //verify that  j is unique one
        System.out.println(map.containsKey("j"));
    }
}
