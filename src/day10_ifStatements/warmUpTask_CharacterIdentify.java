package day10_ifStatements;

public class warmUpTask_CharacterIdentify {
    public static void main(String[] args) {

        /*
        1. write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
         */

         char character = '!';
         boolean isAlphabetic = (character >= 65 && character <=90)|| (character >= 97 && character <=122);

         String alphabetic = "";

        if (isAlphabetic){
            alphabetic = "\"" + character + "\"" + " is Alphabetic";
        }else{
           alphabetic = "\"" + character + "\"" + " is not an Alphabetic";
        }
        System.out.println(alphabetic);

        System.out.println("==============================================");

        /*
        2. write a program that can identify if the given character character is Digit
        ex:
            character = '1'
            output:
            1 is a Digit
            character  = '!'
            output:
            ! is not a digit
 */
        char character2 = 121;
        boolean IsDigit = character2 >=48 && character2 <=57;

        String digit = "";

        if(IsDigit){
            digit = character2 +  " is a digit";
        }else{
            digit = "\"" + character2 + "\"" + " is Not a digit";
        }
        System.out.println(digit);

        System.out.println("==============================================");
        /*
3. write a program that can identify if the given character is a symbol
                ex:
                    character = '!'
                output:
                    ! is a symbol
                    character  = 'a'
                output:
                    a is not a symbol
 */

        char specialChar = 49;
        boolean isSymbol = !isAlphabetic && !IsDigit;


        String symbol = "";

        if(isSymbol){
           symbol = "\"" + specialChar  + "\"" + " is a symbol";
    }else {
        symbol = "\"" + specialChar  + "\"" + " is not a symbol";
        }
        System.out.println(symbol);
    }
}