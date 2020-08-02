package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWords {
    public static void main(String[] args) {

        String str = "catcat";

        int count = 0; //1
        while(str.contains("cat")) {
            count++;
            str.replaceFirst("cat", "");//catcat ==> cat

        }
        System.out.println(str); //cat

       /*
       In this approach we replace "cat" with "" to remove the "cat" and count how many times word occures
        in the string
        to count the frequency
        */




    }
}
