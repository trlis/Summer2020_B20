package Office_Hours.Practice_07_15_2020;

public class FrequecyofDifWords {
    public static void main(String[] args) {

        String str = " dog dog dog cat cat cat cat cat cat dog dog ";
        str = str.toLowerCase();

        int countOfDog = 0;
        while (str.contains("dog")) {
            str = str.replaceFirst("dog,", "");
            //"dog dog"
            //"dog"
            //""
            countOfDog++;
        }
            int countOfCat = 0;
            while (str.contains("cat")) {
                str = str.replaceFirst("cat,", "");
                //"cat cat"
                //"cat"
                //""
                countOfCat++;


        }
        System.out.println(countOfDog);
        System.out.println(countOfCat);
    }
}
