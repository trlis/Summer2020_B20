package day23_Array;
import java.util.Scanner;

public class warmUp3_FrequencyOfChars {
    public static void main(String[] args) {
        /*
        3. write a program that can return the frequency of every single characters from the string:
        ex:
        str1 = "aabbccaa";
        output: a4b2c2
        HINT:
        easier approach:
        1. remove duplicates ==> str2 = "abc"
        2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
        3. result: a4b2c2
        previous section we leaned how to find the frequency of one character. you will need to repeat the same steps
         */
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine(); //ABAB => A2B2
        String nonDup = "";             //AB
        String result = "";             //A2B2

        for(int i = 0; i<= str.length()-1; i++){
          String c = "" + str.charAt(i); // A, B, A, B

            if(!nonDup.contains(c)){
                nonDup += c;
                System.out.println(nonDup);

            }
        }
        System.out.println(nonDup);

        //str = ABAB => AB

       char c = nonDup.charAt(0) ;//A
        int count =0;

        for(int i = 0; i <= str.length()-1; i++){

            if(str.charAt(i) == c){
                count =+1;
            }

        }

        char c2 = nonDup.charAt(0) ;//A
        int count2 =0;

        for(int i = 0; i <= str.length()-1; i++){

            if(str.charAt(i) == c2){
                count2 =+1;
            }

        }

        result+= "" + c + count;

        /*
         String str = "ABAB";  //"A2B2"
        String nonDup = "";  //"AB"
        String result = "";  //"A2B2"


        for(int i = 0; i <= str.length()-1; i++){  // removing duplicates from str
             String ch = ""+ str.charAt(i);  // A, B, A, B
            if(!nonDup.contains( ch )){
                nonDup += ch;
            }
        }

        System.out.println(nonDup);

        // str ="ABAB"     nonDup = "AB"

        for(int j=0; j <= nonDup.length()-1; j++ ){

            char ch = nonDup.charAt(j);
            int count = 0;
            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == ch){
                    count+=1;
                }
            }

            result += ""+ch + count;

        }

        System.out.println(result);

         */


    }
}
