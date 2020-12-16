package Office_Hours.Practice_09_09_2020;

public class PhoneShop {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("================iPhone================");

        Iphone iphone= new Iphone("11 Pro", 1000);

        iphone.call(911);
        iphone.text(456879456);

        System.out.println(iphone);


        System.out.println("");
        System.out.println("===================Samsung=====================");

        Samsung samsung =new Samsung("Galaxy S10 Plus", 799.99);

        samsung.call(548796521);
        samsung.text(548965213);

        System.out.println(samsung);

        System.out.println("");
        System.out.println("=============Nokia=============");

        Nokia nokia = new Nokia("9", 500);

        nokia.call(898565235);
        nokia.text(879465135);

        System.out.println(nokia);





    }
}
