package Day32_MethodOverloading;
/*
WarmUp tasks:
    1. write a method that can return the full name of a person in regular format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"

    3. write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array
        Ex:
            int[] arr = {1,2,3};
            int num = 4;
            addElement(arr, num); ===> {1,2,3,4}

 */
public class WarmUpTask_FullName {
    public static void main(String[] args) {
        String firstN = "cYbErTeK";
        String lastN = "SCHOOL";

       String regFormName = formatFullName(firstN, lastN);
        System.out.println(regFormName);




    }
    //Task 1:
    public static String formatFullName(String firstN, String lastN) {


        firstN = firstN.substring(0, 1).toUpperCase() + firstN.substring(1).toLowerCase();
        System.out.println(firstN);

        lastN = lastN.substring(0, 1).toUpperCase() + lastN.substring(1).toLowerCase();
        System.out.println(lastN);

        String regularFormat = firstN + " " + lastN;

        return regularFormat;


    }
}
