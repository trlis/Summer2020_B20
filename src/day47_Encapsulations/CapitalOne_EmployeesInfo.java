package day47_Encapsulations;

public class CapitalOne_EmployeesInfo {

    public static void main(String[] args) {


        CapitalOneEmployees employee1= new CapitalOneEmployees("Jim Norman", 42, "Manager");

        employee1.setID(121354);
        employee1.setSalary(125_000);
        employee1.setAdress(" Florida");

        System.out.println(employee1.employeeName);
        System.out.println(employee1.age);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.companyName);
        System.out.println(employee1.getID());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getAdress());


    }
}
