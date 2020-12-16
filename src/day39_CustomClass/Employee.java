package day39_CustomClass;

public class Employee {

    String name;
    char gender;
    long SSN;
    String jobTitle;
    double salary;

    public void setEmployeeInfo(String employeeName, char employeeGender,long employeeSSN,
                                String employeeJobTitle, double employeeSalary) {

        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;


    }
    public void getEmployeeInfo(){
        System.out.println("Name: "+ name + ", Gender: " + gender + ", Job Title: " +jobTitle + ", Salary: " + salary);
        String ssn = "" + SSN;
        System.out.println("Last for digits of the SSN: " + ssn.substring(ssn.length()-4));
    }
}
