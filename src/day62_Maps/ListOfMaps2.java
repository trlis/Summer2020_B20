package day62_Maps;

import day33_LocalDateTime.Local_Date;

import java.time.LocalDate;
import java.util.*;

public class ListOfMaps2 {

    public static void main(String[] args) {

        String[] friends = {"Kate", "Ann","Angelika","Ana"};
        LocalDate[] DOBFriends ={LocalDate.of(2000,10,20),
                                  LocalDate.of(1999,4,14),
                                  LocalDate.of(2000,6,23),
                                  LocalDate.of(1982,4,25)};


        String[] classMates = {"Shakhzod", "Heydar", "Busra O", "Kalbinur", "Zeynep"};
        LocalDate[] DOBClassMates = {LocalDate.of(1991,5,18),
                                      LocalDate.of(1991,7,9),
                                      LocalDate.of(1990,11,5),
                                      LocalDate.of(1985,5,13),
                                        LocalDate.of(1981,10,5)};

        String[] family = {"Mom","Dad", "Brother"};
        LocalDate[] DOBFamily = {LocalDate.of(1972,05,18),
                                LocalDate.of(1974,9,18),
                                LocalDate.of(2013,1,11)};

        List<Map<String, Local_Date>> list = new ArrayList<>();
        list.addAll(Arrays.asList(

                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
        ));

        System.out.println(list);




    }
}
