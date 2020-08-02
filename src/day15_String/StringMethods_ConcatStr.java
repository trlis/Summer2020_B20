package day15_String;

public class StringMethods_ConcatStr {
    public static void main(String[] args) {

        //concat(Str): concatenation

        String schoolName = "Cybertek";

        schoolName = schoolName.concat("School"); // "Cybertek School"
        System.out.println(schoolName);

        String r1 = "Cybertek" + 123 + 'A'+ true; //123
        System.out.println(r1);

        String r2 = "Cybertek".concat("123");
        System.out.println(r2);
    }
}
