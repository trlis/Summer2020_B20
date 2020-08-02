package day17_StringReview;

public class StringMethodsReview {
    public static void main(String[] args) {

        /*
        String methods:

        charAt(), +, length(), toUpperCase(), toLowerCase, trim(), substring(), replace(), replaceFirst(),
        indexOf(), lastIndexOf(),

        equals, equalsIgnoreCase, isEmpty(), endsWith(), startsWith(), contains() - boolean
        */

        System.out.println("\n=========== charAt() Method ============");

        //ChatAt(argument - info that needed for the function) enables to get a specific character out of the string.
        //RETURNS AS A CHAR

        String str = "Cybertek";
        //            01234567 - index numbers

        char ch1 = str.charAt(1); // returns a char( character )
        System.out.println(ch1);


        System.out.println("\n============= + Operator for comcatanation =============");

        String str2 = "Cybertek";
        str2 = str2 + " School"; // does not modify str2 object. It returns as a new String
        System.out.println(str2);

        System.out.println("\n============ length() Method ================");

        //length() - returns the total numbers of the characters.
        //RETURNS AS AN INT
        // Does nothing except counting number of elements

        String str3 = "Cybertek";
        //             01234567
        int strLength = str3.length();
        System.out.println("String length: " + strLength); // 8 - not the last index number of the string str3.

        //char ch2 = str3.charAt(strLength);
        //System.out.println(ch2); // error. strLength = 8. The last Index Num of the string is 7.
        // Arg strLength is out of range.

        // Last character Index Number : length - 1
        int lastCharIndex = str3.length()-1;
        System.out.println("Last index: " + lastCharIndex); // 7 - the last index number of the string str3.


        System.out.println("\n============ toUpperCase() & toLowerCase() Methods ==================");

        // UPPER CASE

       String str4 = "cybertek";
       str.toUpperCase(); // "cybertek". without assigning references to the "cybertek" not to the new object "CYBERTEK"
       str4 = str.toUpperCase(); //"CYBERTEK".  doesn't modify str4. Creates a new string.

        //too keep the original objects, the new object must be assigned to the  new variable

        System.out.println(str4);

        //using the String method without assigning variable you can not make that variable assigned to the new one
        //Without assigning the variable will still be reference to the old object;

        // LOWER CASE

        String str5 = "JAVA";
        str5.toLowerCase(); //"JAVA"
        str5 = str5.toLowerCase();
        System.out.println(str5); // "java"

        System.out.println("\n============ trim() Method ==================");

        //trim(): removes extra(unused) space
        //Removes any space that doesn't separate the words

        String str6 = "   Cybertek     School    "; //(extra space between the words won't be removed)
        System.out.println(str6);
        str6.trim(); // "   Cybertek    Scool     ";
        str6 = str6.trim(); //"Cybertek     School" - new String
        System.out.println(str6);


        System.out.println("\n============ substring() Method ==================");

        // substring(): portion of the string

        String str7 = "I like Java language";
        //             01234567890123456789

        //str7 = str7.substring(7, 10); //Jav
        //String word = str7.substring(7, 11); // ending index is excluded. To include char with index 10, we need to end with index 11.
        //System.out.println(str7); //Jav
        //System.out.println(word); //Java

        String word2 = str7.substring(12); // exclude text from the string from the given index
        System.out.println(word2);

        String word3 = str7.substring(12, str7.length()-1 + 1);
        System.out.println(word3);


        System.out.println("\n============ indexOf() & lastIndexOf()  Method ==================");

        //indexOf() & lastIndexOf(): retur the index num.
        //RETURNS AS AN INT

        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you!";
        int i1 = str8.indexOf("W");
        System.out.println(i1); //23
        System.out.println(str8.charAt(i1)); //W

        int i2 = str8.indexOf(", W");
        System.out.println(i2);
        String str8new = str8.substring(36); //index of the first character (,)
        System.out.println(str8new);

        int i3 = str8.indexOf("We"); // index of (W)
        System.out.println(i3);
        String str8new2 = str8.substring(38);
        System.out.println(str8new2);

        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J");
        int i5 =  str9.indexOf("J");
        int i6 = str9.indexOf(" Java ");
        int i7 = str9.lastIndexOf("Java");


        System.out.println(i4); //10 - last J
        System.out.println(i5); //0 - first J
        System.out.println(i6); //4 - index of the space after the first "Java"
        System.out.println(i7); //10

        System.out.println("\n============ replace(), replaceFirst() Methods ==================");

        //replace() - replace all of the
        //replace() - replace only the first one

        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java", "C#");
        System.out.println(s1);  //I like C#, C# is a programming language

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java", "C#");
        System.out.println(s2); //"I like C#, Java is a programming language";

        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replaceFirst("Java is", "C# is");
        System.out.println(s3); //"I like Java, C# is a programming language";
















































    }
}
