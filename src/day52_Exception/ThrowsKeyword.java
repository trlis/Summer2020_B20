package day52_Exception;

public class ThrowsKeyword {

    public static void main(String[] args) {
        //method1(3); //exception was temporary handled by throws
        method2(); //exception was permanently by try&catch
       // method3();

    }

    public static  void method1(int seconds) throws InterruptedException {
        Thread.sleep(3000);
    }


    public static void method2(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {

        }
    }
            public static void method3 ()throws InterruptedException {
                Thread.sleep(3000);
            }

        }

