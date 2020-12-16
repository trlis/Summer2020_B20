package Office_Hours.Practice_08_31_2020;

public class Static_Vs_Instance {

    int instanceVar ;
    static  int staticVar ;

    public static void main(String[] args) {


        System.out.println(staticVar);
        System.out.println();

         Static_Vs_Instance obj = new Static_Vs_Instance();
        System.out.println(obj.instanceVar);  //0

        System.out.println("====================================");

        Static_Vs_Instance obj1 = new Static_Vs_Instance();
        obj1.instanceVar = 100;
        obj1.staticVar = 200;

        Static_Vs_Instance obj2 = new Static_Vs_Instance();


        System.out.println(obj1.instanceVar);//100
        System.out.println(obj1.staticVar);//200

        System.out.println(obj2.instanceVar);//0
        System.out.println(obj2.staticVar);//200

        System.out.println(Static_Vs_Instance.staticVar);

        System.out.println("===================================");




    }


    }


