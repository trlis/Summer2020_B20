package day24;

public class UniqueNumbers2 {
    public static void main(String[] args) {


        int[] arr = {1, 1, 2, 3, 3, 6, 8, 9, 6, 4, 4, 1, 7,};

        for (int a : arr) {


            int count = 0;

            for (int b : arr) {
                if (b == a) {
                    count++;

                }

            }
            if (count == 1) {
                System.out.println(a + "a");
            }
        }
    }


}