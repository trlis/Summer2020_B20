package day48_Inheiritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Cherry","Small",2, 'F');
        System.out.println(dog1.name);
        System.out.println(dog1.size);
        System.out.println(dog1.gender);
        System.out.println(dog1.age);


        dog1.bark();
        dog1.eat();
        dog1.sleep();








    }

}
