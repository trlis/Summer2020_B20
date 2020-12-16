package day44_Constructor;

public class Student {

    String name;
    int age;
    char gender;

    static String schoolName = "Cybertek University";

    public Student(String name, int age, char gender) {
        System.out.println("Students info: " + name + " " + age + " y.o " + " gender: " + gender  + " studying at: " + schoolName);
    }

    public static void main(String[] args) {

    Student student1 = new Student("Mike", 25, 'M');
    Student student2 = new Student("Smith", 28, 'M');
    Student student3 = new Student("Mary", 32, 'F');


    }
}
