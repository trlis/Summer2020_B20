package day47_Encapsulations;

public class UserCredentials {
    public static void main(String[] args) {

        Credentials obj = new Credentials("Mike", 34);
        obj.setUsername("Cybertek");
        obj.setPassword("Cybertek12345");


        System.out.println(obj.companyName);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println("Username: " + obj.getUsername());
        System.out.println("Password: " + obj.getPassword());




    }
}
