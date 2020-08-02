package day04_variables;

public class variablesPractice2 {
    // double > float > long > int > short > byte

    public static void main (String[] args){

        int iNum = 50_000;
        long lNum =iNum; //50

        System.out.println(iNum);
        //instead 50,000 -> use 50_000 if needed

        //int iNum2 = lNum
        float fNum = lNum; //50.0

        int num2 ;
        num2 = 1000; //1000
        num2 = 2000; //2000
        System.out.println(num2); //2000 the last value of the "num2"

        num2 = 5000;
        System.out.println(num2);

        num2 = 2000;


    }
}
