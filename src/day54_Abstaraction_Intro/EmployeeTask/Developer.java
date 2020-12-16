package day54_Abstaraction_Intro.EmployeeTask;

import java.time.LocalDate;

public final class Developer extends Employee {

    public Developer(String name, char gender, LocalDate DOB, String jobTitle, double salary){
        super(name, gender, DOB, jobTitle, salary); //super class' constructor(Employee)


    }


}
