package day44_Constructor;

/*
 /*warmup task:
            1. Create a class called Employee
            instance variables:
    name, id, ssn, jobTitle, salary, gender
    actions:
    setEmployeeInfo(): can initialize all the instance variables
    toString(): can return the info of the employee as string
    2. create a class called HumanResources
            declare 5 variables of Employee as static
    use static block to:
            1. initialize those static variables
                        2. set all the info of the Employees
    3. create class called BankOfAzerbaijan
            in the main method:
            1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee info
                */

public class HumanResources {


    static Employee employee1; //we can call it through the class name
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

    static {

        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();
        employee4 = new Employee();
        employee5= new Employee();


        employee1.setEmployeeInfo("Muhammed", 12312, 456432, "SDET", 120000, 'M');
        employee2.setEmployeeInfo("Erkan", 45678, 123987, "QA", 115000, 'M');
        employee3.setEmployeeInfo("Asiya", 56431, 657098, "Instructor", 99000, 'F');
        employee4.setEmployeeInfo("Ayse", 17876, 342567, "SDET", 125000, 'F');
        employee5.setEmployeeInfo("Ahmet", 67543, 987654, "Developer", 140000, 'M');

    }
}
