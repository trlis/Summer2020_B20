package day17_StringReview;

public class StringMethodsReview_Boolean {
    public static void main(String[] args) {


        // equals, equalsIgnoreCase, isEmpty(), endsWith(), startsWith(), contains() - related to boolean

        //RETURN True || False

        System.out.println("============== equals(), equalsIgnoreCase() Methods,============================");

        //equals(): checks the equality of two text (Case sensitive)
        //equalsIgnoreCase(): checks the equality of two text (ignores Case sensitivity);

        //equals() - case sensitive

        String s1 = "Cat"; //String pool
        String s2 = new String ("Cat"); //Heap memory
        String s3 = new String ("Cat");

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); // true, because the s1 and s2 are same texts
        System.out.println(s2 == s3); //false
        System.out.println(s2.equals(s3)); //true

        //equalsIgnoreCase() - ignores case sensitivity

        String s4 = "java";
        String s5 = "Java";

        System.out.println(s4 == s5); //false
        System.out.println(s4.equals(s5)); //false
        System.out.println(s4.equalsIgnoreCase(s5)); //true

        String s6 = "MuHtAr";
        String s7 = "muhtar";
        System.out.println(s6.equalsIgnoreCase(s7)); //true
        System.out.println(s6.equals(s7)); //false


        System.out.println("============== isEmpty() Method============================");

        //isEmpty() - checks if the length of the string is zero or not

        String str = "  ";
        System.out.println(str.isEmpty()); //false (it has two spaces) : length doesn't equal to zero

        str = str.trim(); // ""
        System.out.println(str); //true


        String str2 = "Cybertek";
        System.out.println(str2); //false

        str2 = "";
        System.out.println(str2); // true : length equals to zero

        System.out.println("============== endsWith(), startsWith()============================");

        //startsWith(): checks ending characters

        String str5 = "Cybertek";
        System.out.println(str5.startsWith("Cy"));// true
        System.out.println(str5.startsWith("Cyber")); //true
        System.out.println(str5.startsWith("CybABC")); //false
        System.out.println((str5.startsWith("E")) || (str5.startsWith("C"))); //true
        //                                  false || true ==> true

        //endsWith(): checks ending characters

        String str6 = "Today is a great day!";
        System.out.println(str6.endsWith("day")); //false
        System.out.println(str6.endsWith("day!")); //true
        System.out.println(str6.endsWith("great")); //false


        System.out.println("============== contains()============================");

        //contains():  checks if the string contains smth or not

        String str3 = "Java, C#, Python, ruby, C++";
        System.out.println(str3.contains("Java")); // true
        System.out.println(str3.contains("java")); //false (case sensitivity)
        System.out.println(str3.toLowerCase().contains("java")); //true

        String str4 = "ABCD";
        System.out.println(str4.contains("D")); //true



    }
}
