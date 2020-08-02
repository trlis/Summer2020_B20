package day31_CustomMethodsRecap;

import Library.Util;

/*
 3. use the methods removeDup and frequency in util class to create a thrid method called frequencyOfChars that can find the frequency of all characters from a string
        Ex:
            frequencyOfChars("AAABBBBCCCC");  ===> A3B4C4
            frequencyOfChars("DDEFJJJ"); ===> D2E1F1J3
            please copy paste the method to the util class

 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str = "AAABBBBCCCC";

        String expectedResult = "";// ===> ABC  ==> A3B4C4

        String nonDup = Util.removeDuplicates(str); //ABC

        String str2 = "dagcsfdsnmcs";

        String expectedResult2 = Util.frequencyOfChars(str2);
        System.out.println(expectedResult2);




    }

    public static String frequencyOfChars(String str) {

        String expectedResult = "";// ===> ABC  ==> A3B4C4

        String nonDup = Util.removeDuplicates(str); //ABC


        for (char each : nonDup.toCharArray()) {
            int count = Util.frequency(str, each);
            expectedResult = "" + each + count;
            System.out.print(expectedResult);


        }
        return expectedResult;
    }

    /*
        for (int i = 0; i <= nonDup.length(); i++) {
            char each = nonDup.charAt(i);
            int count = Util.frequency(str, each);
            expectedResult = "" + each + count;
            System.out.println(expectedResult);
        }
*/

}
