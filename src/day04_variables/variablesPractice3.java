package day04_variables;

/*

task
declare the following variables:
    employeeName
    employeeID
    jobTitle
    salary
    gender (char)
    isFullltime (boolean)
 */

public class variablesPractice3 {
    public static void main(String[] args) {


        String employeeName = "Julie Pitt";
        int employeeID = 45665;
        String jobTitle = "SDET";
        double salary = 100000;
        char gender = 'F';
        boolean isFullTime = true;
        boolean isPartTime = false;

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employe ID: " + employeeID);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Full time is" + isFullTime);


    }
}
