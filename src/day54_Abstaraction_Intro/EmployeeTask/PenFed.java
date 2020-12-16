package day54_Abstaraction_Intro.EmployeeTask;

import java.time.LocalDate;

/*
4. create a class called PenFed
            create 3 objects of Tester and Developers
            try to make change to the gender & DOfB of the employees
 */
public class PenFed {

    public static void main(String[] args) {
        Tester tester1 = new Tester("Polat Alemdar", 'm', LocalDate.of(1975,10,15),"QA",120_000);
        //tester1.gender = 'F' //can only read it, Cannot modify
        //tester1.DOB = LocalDate.of(2000,11,20) //can only read it, Cannot modify


        System.out.println(tester1.gender);
        System.out.println(tester1.DOB);
    }
}
