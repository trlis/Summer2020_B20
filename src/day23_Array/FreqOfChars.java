package day23_Array;
import java.util.Scanner;

public class FreqOfChars {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();


        String nonDup ="";

        for(int i =0; i <= str.length()-1; i++ ){
            String ch = "" + str.charAt(i);

            if(nonDup.contains(ch)) {
                continue;
            }else {
                nonDup += ch;

            }
        }
        String expectResult = "";
        // str = "BBCCDD"   nonDup = "BCD"  ==> B2C2D2

        for(int j = 0; j<= nonDup.length()-1; j++ ) { //iterates the String nonDup

            char ch1 = nonDup.charAt(j); //B, C, D
            int count1 = 0; //1 + 1 = 2

            for (int i = 0; i <= str.length() - 1; i++) { //returns the frequency of each ch from str
                if (str.charAt(i) == ch1) {
                    count1++;
                }
            }
            expectResult += "" + ch1 + count1;
        }

     /*   char ch2 = nonDup.charAt(1); //C
        int count2 = 0;
        for(int i =0; i<= str.length()-1; i++){
            if(str.charAt(i) == ch2){
                count2 ++;
            }
        }
        expectResult += "" + ch2 + count2;

        char ch3 = nonDup.charAt(2); //C
        int count3 = 0;
        for(int i =0; i<= str.length()-1; i++){
            if(str.charAt(i) == ch3){
                count3 ++;

      */// Debugging the loop

        System.out.println(expectResult);
            }
        }


