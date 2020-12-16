package day62_Maps;

import java.util.*;

public class ListOfMaps {

    public static void main(String[] args) {

        Map<String, String> scrum1 = new LinkedHashMap<>();

        scrum1.put("Heydar", " Software Developer");
        scrum1.put("Lisa", "Junior Software Automation Tester");
        scrum1.put("Ana", "SDET");
        scrum1.put("Busra O", "Developer");
        scrum1.put("Ceren", "Scrum Master");
        scrum1.put("Shakhzod", "PO");

        Map<String, String> scrum2 = new LinkedHashMap<>();

        scrum2.put("Muhtar", "Senior SoftwareDeveloper");
        scrum2.put("Fatime M", "SDET");
        scrum2.put("Arzu", "QA");
        scrum2.put("Bahtiyar", "SDET");
        scrum2.put("Romina", "BA");


        Map<String, String> scrum3 = new LinkedHashMap<>();

        scrum3.put("Imran", "Senior SoftwareDeveloper");
        scrum3.put("Dilfinar", "SDET");
        scrum3.put("Atilla", "QA");
        scrum3.put("Aidana", "SDET");
        scrum3.put("Kamran", "BA");

        List<Map<String, String>> teams = new ArrayList<>();
        teams.addAll(Arrays.asList(scrum1, scrum2, scrum3));

        System.out.println(teams);

        System.out.println("===================================");

        for (Map<String, String> eachMap : teams) { // looping each map in the list
            System.out.println(eachMap);
            for (Map.Entry<String, String> each : eachMap.entrySet()) {
                String name = each.getKey();
                String jobTitle = each.getValue();
                if (jobTitle.equals("SDET")) {
                    System.out.println(name);
                }
            }

        }
    }

}
