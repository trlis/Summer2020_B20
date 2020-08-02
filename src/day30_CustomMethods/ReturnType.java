package day30_CustomMethods;

public class ReturnType {
    public static void main(String[] args) {

        /*
        Return type:
        void: doesn't return any value from the method. it only executes the functionality.
        I can only print it out
        Data is not reusable


        DataType: method MUST return a value

        Return statement:
        -exits the
        -returns the value

         */

        addition(3,4);
       int sum = addition2(3,4);

        System.out.println(sum*2);

    }
    public static void addition(int a, int b){
        int sum = a+b; //i cant use sum anywhere else since the return type is void
        System.out.println(sum);
    }

    public static int addition2(int a, int b){

        int sum =a+b;
      return sum;




    }
}
