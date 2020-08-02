package day33_LocalDateTime;

public class Unique {
    /*
     Task03:
        1. create a method that can print out the unique numbers from an array of integer
        2. create a method that can print out the unique numbers from an array of double
        3. create a method that can print out the unique words from an array of String
        4. create a method that can print out the unique characters from an array of chars
     */
    public static void main(String[] args) {

        int[] arr = {1, 6, 55, 1, 3, 3, 9, 10, 10, 88, 55, 6, 4, };
        double[] arr1 = {1.2,2.3,3.4,4.5,2.3,1.2,4.4};
        char[] arr2 = {'a', 'a', 'A', 'B', 'B', 'b'};
        String[] arr3 = {"Hello", "Hello", "Bye"};


        uniqueElements(arr);
       uniqueElements(arr1);
       uniqueElements(arr2);
        uniqueElements(arr3);



    }

    public static void uniqueElements(int[] arr) {

        for (int element : arr) {
            int count = 0;
            for (int each : arr) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");

            }
        }
        System.out.println();//after the nested loop

    }
    public static void uniqueElements(double[] arr) {

        for (double element : arr) {
            int count = 0;
            for (double each : arr) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");

            }
        }
        System.out.println();//after the nested loop

    }
    public static void uniqueElements(String[] arr) {

        for (String element : arr) {
            int count = 0;
            for (String each : arr) {
                if (element.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");

            }
        }
        System.out.println();//after the nested loop

    }

    public static void uniqueElements(char[] arr) {

        for (char element : arr) {
            int count = 0;
            for (char each : arr) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");

            }
        }
        System.out.println();//after the nested loop

    }
}

