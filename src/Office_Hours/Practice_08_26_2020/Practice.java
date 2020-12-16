package Office_Hours.Practice_08_26_2020;

public class Practice {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();

        int[] arr2 = {9, 8, 7, 6, 5, 4};
        for (int each : arr2) {
            System.out.println(each + " ");
        }
        System.out.println();


        int[] arr3 = {100, 200, 300};

        for (int j = 0; j <= arr3.length - 1; j++) {
            System.out.println(arr3[j]);
        }
        System.out.println();
    }
}