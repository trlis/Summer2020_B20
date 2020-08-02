package day04_variables;

public class concatenation_addition {
    public static void main(String[] args){

        //addition: num + num
        System.out.println( 12 + 13 ); // 25
        System.out.println('A' + 2); //65 + 2 = 67
        System.out.println('A' + 'B'); //131

        //Concatenation: append
        System.out.println("12" + 13); // 1213
        System.out.println('A' + 2); // 67
        System.out.println("A" + 2); //A2
        System.out.println("Gender: " + 'M'); //Gender: M
        System.out.println("Tax: " + 3.5 +"%"); //Tax: 3.5%
        System.out.println("Tax: " + 3.5 +'%'); //Tax: 3.5%
        System.out.println(3.5 +'%' + " Tax"); //40.5 Tax



        System.out.println("Tax: " + 3.5 + '%'); //Tax: 3.5%
        System.out.println(3.5 + '%' + "Tax"); //40.5 Tax;
        System.out.println("================");

        System.out.println("Good morning" + 7 + 30);
        System.out.println(7+30 + "Good morning");






    }
}
