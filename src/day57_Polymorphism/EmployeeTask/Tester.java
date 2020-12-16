package day57_Polymorphism.EmployeeTask;

public class Tester extends Employee {

    public Tester(String name, int id, String jobTitle, double salary, char gender) {
        super(name, id, jobTitle, salary, gender);
    }

    @Override
    public void work() {

    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
