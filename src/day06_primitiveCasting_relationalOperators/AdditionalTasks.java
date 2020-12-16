package day06_primitiveCasting_relationalOperators;

public class AdditionalTasks {

    public static void main(String[] args) {


        //Task1
        int pies =10, people =4;
        double piesPerson;
        piesPerson =pies/people;
        System.out.println(piesPerson); //2.0

        //Task2
        int pie =10, men =4;
        double piesForMen;
        piesForMen =(double)pie/men;
        System.out.println(piesForMen); //2.5

        //Task3
        int cakes =10, girls=4;
        double cakesForGirls;
        cakesForGirls =cakes/(double)girls;
        System.out.println(cakesForGirls); //2.5

        //Task3
        int cake =10, girl=4;
        double cakeForGirl;
        cakeForGirl =(double)(cake/girls);
        System.out.println(cakeForGirl); //2.0

    }
}









