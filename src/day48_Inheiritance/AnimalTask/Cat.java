package day48_Inheiritance.AnimalTask;

public class Cat extends Animal{


    /*
    variables: 4 : name, age, size, gender
    methods: 5

 */

    public Cat(String name, String size, int age, char gender){
        setInfo(name, size, age, gender);
    }

    public void meow(){
        System.out.println(name + "is meowing");
    }
}
