package Office_Hours.Practice_07_13_2020;

public class FrequencyOfChars {
    public static void main(String[] args) {

        /*
        Find the frequency of characters

         */

        String str = "OOPQQ"; //O2P1Q2

        //1.remove the duplicates "OPQ"

        String nonDup = "";

        for(int i =0; i<=nonDup.length()-1; i++){

         /* String s = "" + str.charAt(i);

            if(!(nonDup.contains(s))){ // IF THE STRING S DOES NOT CONTAINS CHAR, tHE CHAR COMCATES TOTHE STRING NONDUP
                nonDup+=s;
                */



            String result = "";
           //NonDup = "OPQ     str = "OOPQQ"   ===> O2P1Q2
           char ch1 = nonDup.charAt(0); //0
           int count = 0; // 1+1=2

           for(int n = 0; n<=str.length()-1; n++){
              char each = str.charAt(i); //represent each of the character of the string
               if(each == ch1){
                   count++;

           result+= "" + ch1 + count;
/*
           char ch2 = nonDup.charAt(1);
           int count2 =0;

           for(int j=0; j<= str.length()-1; j++){

               char each2 = str.charAt(j);
               if(each2 == ch2){
                   count +=1;

           result += ""  + ch2 + count2;


           char ch3 =nonDup.charAt(2);
           int count3 =0;

           for(int k =0; k<=str.length()-1; k++){
               char each3 = str.charAt(k);
               if(each3 == ch3) {
                   count3++;

                   result = "" + ch3 + count3;
                   */

                   System.out.println(result);
               }
               }

           }

               }

           }


