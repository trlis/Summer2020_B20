package day41_Static;

public class Cat {
    /*

Task:
    Cat:
        attributes:
                name, age, gender, color, breed
        Actions:
                setInfo, eat, drink, toString
                use this. keyword
    Make sure that you can print out the objects of the Cat in the print statement


     */

    String name;
    int age;
    char gender;
    String color;
    String breed;


    public void setInfoCat(String name, int age, char gender, String color, String breed){

    this.name = name;
    this.age= age;
    this.gender = gender;
    this.color = color;
    this.breed = breed;

        }

     public void eat(String catFood){
         System.out.println(name + " is eating " +catFood);
     }

     public void drink(String catDrink){
        System.out.println(name + " is drinking " +catDrink);

    }

    public String toString(){ // toString method will be executed automatically when the cat object is passed in the print statement
        return "Name: " + name + ", Gender: " + gender + ", Age: " + age + ",  Color: " + color + ", Breed: " + breed + "      ";
    }




}
