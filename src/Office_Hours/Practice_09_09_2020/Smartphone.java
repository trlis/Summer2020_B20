package Office_Hours.Practice_09_09_2020;

public class Smartphone {


    public static String brand;
    public static String madeIn;

    String model;
    double price;



   public Smartphone(String model, double price){
       this.model = model;
       this.price = price;

   }

   public void call(long phoneNumber){
       System.out.println("Phone is calling: "+ phoneNumber);
   }

   public void text(long phoneNumber){
       System.out.println("Phone is texting to: " +phoneNumber);
   }

   public String toString(){
       return "Brand: "+brand+"\nModel: "+model+"\nPrice: $ "+price+"\nMade in: "+madeIn;
   }



}
