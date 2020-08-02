package day16;


public class StringMethods_replace {
    public static void main(String[] args) {

        //replace (old value, new value)

        String str = "trlis369@gmail.com";
        String strNew = str.replace("trlis369", "tarlisaa3");


        System.out.println(strNew);

        String word = "Its July now";
        String newWord = word.replace("July", "June");
        System.out.println(newWord);

        String java = "I like to learn Java, Java is cool, Java is fun";
        String c = java.replace("a, Java", "a, C#");
        System.out.println(c);

        String s1 = "I like to stay in Cybertek, Cybertek is a nice place";
        s1 = s1.replace("Cybertek", "MIT");
        System.out.println(s1);
        s1 =s1.replace("MIT", "Cybertek");
        System.out.println(s1);

        String error = "I leik leaRn Java";
        error = error.replace("eik", "ike" );
        error = error.replace("R", "r");
        System.out.println(error);






}
}