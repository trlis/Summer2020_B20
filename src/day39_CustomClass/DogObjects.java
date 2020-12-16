package day39_CustomClass;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Judy", "Beagle", "medium", 2, "Mix");
        dog1.setDogInfo("Roofus", "Argentinian Dog", "Large", 1, "White");
        dog1.setDogInfo("Winston", "Scotties Terrier", "small", 1, "Black");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Dog Food");
        dog2.eat("Steak");
        dog3.eat("polo");

        dog1.drink("cola");
        dog2.drink("water");
        dog3.drink("milk");

        dog1.sleep();
        dog2.sleep();
        dog3.sleep();
    }
}