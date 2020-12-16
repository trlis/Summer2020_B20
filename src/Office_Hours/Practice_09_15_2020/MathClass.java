package Office_Hours.Practice_09_15_2020;

public class MathClass {

    public static void main(String[] args) {
        //10*10*10
        double r1 = Math.pow(10,3);
        System.out.println(r1);



        double r2 = Math.pow(2,5);
        System.out.println(r2);


        //-1 == 1
        System.out.println(Math.abs(1));


        //4==>2, 9==>3, 25==>5
        System.out.println(Math.sqrt(100));
        System.out.println(Math.sqrt(225));

        System.out.println(Math.sin(30));
        System.out.println(Math.sin(45));
        System.out.println(Math.sin(90));


        System.out.println(Math.PI);
        System.out.println(Math.E);

        int a =100;
        int b =200;

        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
    }
}
