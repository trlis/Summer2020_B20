package day54_Abstaraction_Intro.EmployeeTask;

import java.time.LocalDate;

public final class Tester extends Employee{ //can never have any child classes(can not be super class). can only be a sub class, Cannot give. Only take

     public Tester(String name, char gender, LocalDate DOB, String jobTitle, double salary){

         super(name, gender, DOB, jobTitle, salary); //super class constructor.
     }

     public void findBug(){
         System.out.println(name + "find a bug"); //can not be inhereted to the developer class
     }

     }


