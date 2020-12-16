package day39_CustomClass;

public class CarMax {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Honda", "Fit", 2020, "red", 25000, 20000);
        car1.getInfo();

        Car car2 = new Car();
        car2.setInfo("Tesla", "S", 2019, "grey", 30000, 50000);
        car2.getInfo();

        Car car3 = new Car();
        car3.setInfo("BMW", "i 430", 2018, "blue", 15000, 25000) ;
        car3.getInfo();
        car3.start();

        Car car4 = new Car();
        car4.setInfo("Mini", "Cooper", 2017, "red", 21000, 19000);
        car4.getInfo();

        Car car5 = new Car();
        car5.setInfo("Audi", "A7", 2020, "white", 40000, 28000);
        car5.getInfo();
        car5.start();





    }
}
