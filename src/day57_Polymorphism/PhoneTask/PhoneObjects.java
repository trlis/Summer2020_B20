package day57_Polymorphism.PhoneTask;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("12", "5.3", 1000);
        Samsung samsung = new Samsung("S20", "6.1", 899);
        Huawei huawei=  new Huawei("Robery", "5.3", 25);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);

        Phone phone1 = new Iphone("11", "6", 1200);
        Phone phone2= new Samsung("S10 Plus", "6.4", 999);
        Phone phone3=  new Huawei("R1651", "4.8", 100);


        //Iphone[] phones = {iphone, samsung, huawei}; -array can store only Iphone
        //Samsung[] phones = {iphone, samsung, huawei}; -array can store only Samsung
        //Huawei[] phones = {iphone, samsung, huawei}; -array can store only Huawei

        Phone[] phones = { iphone, samsung, huawei, phone1, phone2, phone3 };

    }
}
