package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import static day44_Constructor.HumanResources.*; // imports all statics from the

public class BankOfAzerbaijan {

    public static void main(String[] args) {


        ArrayList<Employee> list = new ArrayList<>();
        /*
        list.add(HumanResources.employee1); // employee1 - declared as static tats why we can call it through the class name
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);

         */
        //list.addAll(Arrays.asList(HumanResources.employee1, HumanResources.employee2, HumanResources.employee3, HumanResources.employee4,
        // HumanResources.employee5) - by using import static we are able to import the static members, so can call them without the class name.
        list.addAll(Arrays.asList(employee1, employee2, employee3,employee4 ,employee5));

        System.out.println("Total Number of employees: " + list.size());
        System.out.println("=========================================");

        for(Employee each :list){
            System.out.println( each.name +"'s Salary:" + each.salary);
        }
    }
}
