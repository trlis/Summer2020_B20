package day39_CustomClass;

public class CarObject {
    public static void main(String[] args) {


        System.out.println("================= CAR OBJECT 1 ============================");

 Car carObj1 = new Car();

 //  We can call the instance variable through the objects
/*
        carObj1.brand = "Toyota";
        carObj1.model = "Corolla";
        carObj1.year = 2020;
        carObj1.color = "white";
        carObj1.mileage = 20_000;
        carObj1.price = 18_000;
*/
        carObj1.setInfo("Toyota", "Corolla", 2020, "white", 20000, 18000);

        System.out.println(carObj1.brand);
        System.out.println(carObj1.model);
        System.out.println(carObj1.year);
        System.out.println(carObj1.color);


        System.out.println("================= CAR OBJECT 2 ============================");

        //each object has its own copy of instance variables. Car2 - new objects has new copies
        Car carObj2 = new Car();

     /*
        carObj2.brand = "Mercedes";
        carObj2.model = "G 550";
        carObj2.year = 2000;
        carObj2.color = "black";
     */
        carObj2.setInfo("Mercedes", "G 550",2000, "black", 15000, 40000 );


        System.out.println(carObj2.brand);
        System.out.println(carObj2.model);
        System.out.println(carObj2.year);
        System.out.println(carObj2.color);

           System.out.println("================== MY CAR =========================");

           Car myCar = new Car();

           myCar.setInfo("Honda", "Fit", 2018, "Red",25000, 20000);

           myCar.getInfo();


           System.out.println("================== MY PARENTS CAR =================");

           Car myMomsCar = new Car();

           myMomsCar.setInfo("Honda", "CRV", 2016, "Red",19000, 18000);

            myMomsCar.getInfo();









}

}
