package day39_CustomClass;

public class Car {
  /*
    Attributes:
        model, brand, year, color, mileage, price... - fields /  instance variables ( can store different data )
     */

    //attributes
    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;


    //sets the info of the car
    public void setInfo(String carBrand, String carModel, int carYear, String carColor,double carMileage, double carPrice){

        brand = carBrand;
        model = carModel;
        year = carYear;
        color =carColor;
        mileage = carMileage;
        price = carPrice;

    }

    public void getInfo(){
        System.out.println(year + " " + brand +" " + model +", " + color + ", " + mileage + ", $" + price) ;
    }

    public void start(){
        System.out.println(brand + " " + model + " is started");
    }

    public void stop(){
        System.out.println(brand + " " + model + " is stopped");
    }




}


