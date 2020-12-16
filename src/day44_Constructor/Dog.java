package day44_Constructor;

public class Dog {

    String name;
    String breed;
    String size;
    int age;

    public Dog(String name, String breed,String size, int age){
        this.name = name;
        this.breed= breed;
        this.size =size;
        this.age= age;


    }
    public void Introduce(){
     System.out.println("Dog's info: Name: " + this.name + ", Breed: " + this.breed + ", Size: " + this.size + ", age: "  +age);
    }

}
