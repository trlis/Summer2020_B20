package Office_Hours.Practice_07_14_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Unique {
    public static void main(String[] args) {

        String str = "ABABC";
        String expectResult = ""; //C - unique character with frequency 1

        //1. create a new string to store a unique object(s).

        String expectedResult = "";

        //2. find a frequency of every single character from the String str

        for(int k =0; k<=str.length()-1; k++){ //iterates every single character from the String
        char ch = str.charAt(k); // A B A B C ==> each char separately
        int count = 0;

        //3. we need co compare ch1 with every single element in the String str
        for(int i = 0; i<= str.length()-1; i++){ //inner loop - calculates the frequency of char(k) and assigns it to
            char each = str.charAt(i); //ABABC                  count variable
            if(each == ch){
                count++;
            }
        }
        if(count ==1) {
            expectedResult += ch;
        }

        }
        System.out.println(expectedResult);















    }
    }

