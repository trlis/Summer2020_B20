package day44_Constructor;

public class Employee {
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


    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static  boolean isEmployed;
    static  boolean hasSalary;

    static { //runs first only one time
        isEmployed = true;
        hasSalary = true;
    }

    public void setEmployeeInfo(String name, int id, int ssn, String jobTitle,double salary, char gender ){

        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;



    }


    public String toString(){
        return "Name: " + name + "\nGender: " + gender + "\nJob Title: " + jobTitle + "\nID: " + id + "\nSSN: " + ssn + "\nSalary: " + salary +
                "\nIs Employed:"  +isEmployed + "Has Salary: " + hasSalary;
    }
}
