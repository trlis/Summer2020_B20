package day39_CustomClass;

import java.util.ArrayList;

public class DogPark {
    public static void main(String[] args) {

      Dog[] dogPark = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
      //                 0            1        2           3            4

        dogPark[0].setDogInfo("Karaoglan", "German Shepperd", "medium", 6, "black");
        dogPark[1].setDogInfo("Roko", "German Shepperd", "Medium", 3, "brown");
        dogPark[2].setDogInfo("Champ", "Retriver", "big", 5, "golden");
        dogPark[3].setDogInfo("Akbas","AnatolianSheppard", "large", 2, "white" );
        dogPark[4].setDogInfo("Grizzly", "BoxerPitt", "Large", 3, "mix");


      for(int i = 0; i <=dogPark.length-1; i++ ){
         dogPark[i].getDogInfo();
        }
        System.out.println("===================================");

      for(Dog eachDog : dogPark){
          eachDog.getDogInfo();
      }
        System.out.println("====================================");

      for(Dog eachDog: dogPark){
          String food = "treats";
          eachDog.eat(food);
      }
      String drink = "water";
      for(Dog eachDog: dogPark){
          eachDog.drink(drink);

      }
      String game = "catch the branch";
        for(Dog eachDog: dogPark){
            eachDog.play(game);

        }

        for(Dog eachDog: dogPark){
            eachDog.sleep();

        }


}
}
