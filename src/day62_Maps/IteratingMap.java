package day62_Maps;

import com.sun.org.apache.bcel.internal.generic.LoadClass;

import java.time.LocalDate;
import java.util.*;

public class IteratingMap {

    public static void main(String[] args) {

        Map<String,LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(1999,8,9));
        map.put("Aaron", LocalDate.of(1999,8,9));
        map.put("Daniel", LocalDate.of(1999,8,9));
        map.put("James", LocalDate.of(1999,8,9));
        map.put("Caleb", LocalDate.of(1999,8,9));
        map.put("Erik", LocalDate.of(1999,8,9));


        for(String each: map.keySet()){
            System.out.println(each);
        }

        List<String> names = new ArrayList<>( map.keySet());
        System.out.println(names);
        System.out.println(names.get(1));

        System.out.println("=========================================");

        for(LocalDate each : map.values()){
            System.out.println(each);
        }

        List<LocalDate> DOB = new ArrayList<>(map.values());
        System.out.println(DOB.get(1));

        System.out.println("=======================================");


        for(Map.Entry<String, LocalDate> each : map.entrySet()){
            System.out.println(each.getKey()+" : " + each.getValue());


        }




    }
}
