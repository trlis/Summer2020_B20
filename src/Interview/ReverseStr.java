package Interview;

public class ReverseStr {

    public static void main(String[] args) {

        String str = "atevasilE";

        for(int i=str.length()-1; i>=0; i--){


            String newStr = str.charAt(i) +"";
            System.out.print(newStr);
        }


    }

}
