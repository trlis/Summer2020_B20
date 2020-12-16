package day48_Inheiritance;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Test {

    public Test(){
        System.out.println("A");
    }
    public void Test(int a){
        System.out.println("B");
    }
    public Test(double c){
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        Test obj = new Test(100);
    }
}
