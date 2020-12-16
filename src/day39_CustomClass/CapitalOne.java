package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();
        Employee employee6 = new Employee();

        employee1.setEmployeeInfo("Agit",'M',123456789,"SDET",110000);
        employee2.setEmployeeInfo("Mike", 'M',153135335,"QA",100000);
        employee3.setEmployeeInfo("Roman", 'M',123435135,"QA",150000);
        employee4.setEmployeeInfo("Dawud", 'M',538384887,"QA",120000);
        employee5.setEmployeeInfo("Zaim", 'M',456345456,"QA",115000);
        employee6.setEmployeeInfo("Virginia", 'F', 438613153, "BA", 120000);

        ArrayList<Employee> employeeList  = new ArrayList<>();

        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee5));

        for(Employee each: employeeList){
           each.getEmployeeInfo();

        }
        System.out.println("");
        System.out.println("========== Max salary ===============");

        double max = Integer.MIN_VALUE;
        String name  ="";
        for(Employee each: employeeList){
            double eachSalary = each.salary;
            if(eachSalary>max){
                max = eachSalary;
                name = each.name;

            }
        }

        System.out.println("Maximum Salary of " + name + "is: "+ max);

        System.out.println("");
        System.out.println("=================== Remove who makes < 150k ====================");


        employeeList.removeIf(p -> p.salary<150000);

        for(Employee each : employeeList){
            each.getEmployeeInfo();
        }

    }
}
