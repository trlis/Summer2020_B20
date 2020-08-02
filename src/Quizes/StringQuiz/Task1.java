package Quizes.StringQuiz;

public class Task1 {
    public static void main(String[] args) {
        String str = "";
        str.trim();
        System.out.println(str.isEmpty());
        //false because str.trim wasn't assigned

        System.out.println("====================");
        String ta = "A";
        ta= ta.concat("B "); // A B
        String tb = "C ";
        ta = ta + tb;
        ta.replace('C', 'D'); //A B D
        ta = ta + tb; // A B C C
        // C were never replaced by D because line 15 wasn't assigned.


        System.out.println("==========================");


        String s1 = "abc";
        String s2 ="abc";
        System.out.println("s1 == s2 is: " + s1==s2);
        //                "s1 == s2 is: abc"  "abc
        //false


    }
}
