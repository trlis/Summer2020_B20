package Office_Hours.Practice_07_14_2020;

public class UniqueWords {
    public static void main(String[] args) {

        String[] words = {"C#", "C#", "Python", "Python", "Java", };


        for(String each : words) {
            String s = each;
            int count = 0;

            for (String all : words) {
                if (all.equals(s)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);

            }

        }
    }
}
