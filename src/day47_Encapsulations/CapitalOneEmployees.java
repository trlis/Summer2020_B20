package day47_Encapsulations;

public class CapitalOneEmployees {

    public String employeeName;
    public int age;
    public String jobTitle;


    public CapitalOneEmployees(String employeeName, int age, String jobTitle) {
        this.employeeName = employeeName;
        this.age = age;
        this.jobTitle = jobTitle;

    }

    public static String companyName;

    static{
          companyName ="Capital One";
        }

    private int ID;
    private double salary;
    private String adress;

    public void setID(int ID){
      this.ID = 4655412;

    }
    public void setSalary(double salary){
        this.salary = 125_000;

    }
    public void setAdress(String adress){
        this.adress = adress;

    }
    public int getID(){
        return ID;
    }
    public double getSalary() {
        return salary;

    }

     public String getAdress () {
         return adress;

        }

      public String toString(){
        return "Name: " + employeeName+ ", Age: " + age + ", Job Title: " + jobTitle + ", ID: " + getID() + ", Salary: "  +getSalary()+
                ", Adress: " + getAdress();

      }
        }
