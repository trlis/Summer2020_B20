package day24;

public class Arrays_UniqueWords {
    public static void main(String[] args) {

        String[] words = {"C#", "C#", "Java", "Python" ,  "Python", "C++"};

        for(int j =0; j<= words.length-1; j++) {
            String s = words[j]; // represents each element
            // String s =  words[0]; //"C#"
            int count = 0; // to assign te frequency of String s
            // count: 1+1

            for (int i = 0; i <= words.length - 1; i++) {
                String each = words[i];  // "C#", "C#", "Java", "Python" , "Python", "C++"

                if (s.equals(each)) {
                    count += 1;

                }
            }
            if (count == 1) {
                System.out.println(s);
            }
        }


    }
}
