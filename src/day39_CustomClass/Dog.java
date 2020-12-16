package day39_CustomClass;

public class Dog {

    /*
    instance variables :
                    name, breed, size, age, color

    instant methods:
                    setDogInfo, getDogInfo, eat, drink, sleep...
     */
    String name;
    String breed;
    String size;
    int age;
    String color;

    //sets the info of the dog
    public void setDogInfo(String dogName,String dogBreed, String dogSize, int dogAge, String dogColor) {
        //inst.var = argument
        name= dogName;
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;

    }
    public void getDogInfo() {

        System.out.println("Dog's name: " +name + ", breed: " + breed + ", size: " + size + ", age: " + age +" y.o, color: " + color);

    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){

    System.out.println(name + " is drinking " + drink);

    }

    public void sleep() {
    System.out.println(name + " is sleeping");
    }

    public void play(String game){

    System.out.println(name + "is playing");
    }

}
