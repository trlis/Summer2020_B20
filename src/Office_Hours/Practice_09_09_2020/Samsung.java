package Office_Hours.Practice_09_09_2020;

public class Samsung extends Smartphone{

    public Samsung(String model, double price){
        super(model, price);
    }

    static {
        brand = "Samsung";
        madeIn = "Korea";
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println("Samsung " + model + " is calling to " +phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Samsung " + model + " is texting to " +phoneNumber);
    }
}
