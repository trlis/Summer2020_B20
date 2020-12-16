package Office_Hours.Practice_09_09_2020;

public class Iphone extends Smartphone{

    public Iphone(String model, double price){
        super(model, price);
    }

    static {
        brand = "iPhone";
        madeIn = "USA";
    }

    @Override
    public void call(long phoneNumber){
        System.out.println("Iphone " + model + " is calling to " +phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Iphone " + model + " is texting to" +phoneNumber);
    }

}
