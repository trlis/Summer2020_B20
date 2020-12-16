package Office_Hours.Practice_08_19_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class PizzaObjects {
    public static void main(String[] args) {


        ArrayList<Pizza> pizzaForBatch20  = new ArrayList<>();


        for(int i = 0; i<400; i++ ) {
            Pizza myPizza = new Pizza();

            myPizza.setPizzaInfo("large", 2, 2);
            pizzaForBatch20.add(myPizza);

        }
        System.out.println("Total Number of Pizzas: " + pizzaForBatch20.size());
        double totalPrice =0;

        for( Pizza each :pizzaForBatch20){
            totalPrice += each.calcPrice();
        }

        System.out.println("Total price of ordered pizzas: " + totalPrice);

        System.out.println("================================================");

        Pizza pizzaForNadir = new Pizza();
        pizzaForNadir.setPizzaInfo("Large", 3, 4);

        Pizza pizzaForSaim = new Pizza();
        pizzaForSaim.setPizzaInfo("medium", 3, 2);

        System.out.println("Nadir's pizza price: " +pizzaForNadir.calcPrice());
        System.out.println("Saim's pizza price: " + pizzaForSaim.calcPrice());


    }

}
