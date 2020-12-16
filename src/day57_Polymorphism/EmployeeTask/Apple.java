package day57_Polymorphism.EmployeeTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {


       Employee tester1 =  new Tester( "Andrei", 156316, "QA", 12000, 'M');
       Employee tester2 = new Tester("Elizaveta", 28396465, "SDET", 140000,'F' );


       Employee developer1 = new Developer("Heydar",923566, "Developer",160_000, 'M');
       Employee developer2  = new Developer("Ana",563456, "Developer",170_000, 'F');

       Employee scrumMaster = new ScrumMaster("Ivette", 75535, "Scrum Master", 120000, 'F');
       //scrumTeam
        ArrayList<Employee>scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester2, developer1, developer2, scrumMaster));

        for(Employee each : scrumTeam){
            System.out.println(each);
        }
    }
}
