package day44_Constructor;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Carl", "Retriever", "medium", 2);
        Dog dog2 = new Dog("Sherry", "Chow-chow", "medium", 4);
        Dog dog3 = new Dog("Richard", "Great Dane", "large", 5);

        dog1.Introduce();
        dog2.Introduce();
    }
}
