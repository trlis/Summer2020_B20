package Day45_Constructor;
/*
Topic: Constructor Continue
         Constructor calls (this())
class starts at: 7:05 pm
Package name: day45_Constructor
WarmUp tasks:
    1. create a class called Item
                instance variables:
                    name, unitPrice, quantity
                add a constructor that can initialize the fields
                instance methods:
                    calcCost(): returns the total cost as double
                                hint: quantity * unitPrice
                    toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()


 */
public class Item {

    String name;
    double unitPrice;
    int quantity;

     public Item(String name, double unitPrice, int quantity){
         this.name = name;
         this.unitPrice = unitPrice;
         this.quantity = quantity;
         //System.out.println("Item: " + name + ", unit price: " + unitPrice + "$ , quantity: " + quantity);
     }


     public double calcCost(){

         double totalCost = quantity * unitPrice;
         return totalCost;

     }


     }

