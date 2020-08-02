package day16;

public class StringMethods_replaceFirst {
    public static void main(String[] args) {


       /*replaceFirst(Old value, new Value): replaces the first occured value with new value.
        Returns a new string.
        */

        String str = "Java is fun, Java is cool";
        str = str.replaceFirst("Java", "C#");
        System.out.println(str);

        String s3 = "I like to drink tea and tea";
       s3=  s3.replaceFirst("d tea", "d water");
        System.out.println(s3);

        String s4 = "I like to watch Game of Thrones, and Walking dead";
        s4 = s4.replace(", and Walking dead", "");
        System.out.println(s4);
    }
}
