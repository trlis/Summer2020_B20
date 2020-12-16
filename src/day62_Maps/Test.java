package day62_Maps;

public class Test {

    public static void main(String[] args) {

        Color favoriteColor = Color.Blue;
        System.out.println(favoriteColor);

        Browser browserName = Browser.Chrome;


        switch (browserName){

            case Chrome:
                System.out.println("Chrome Browser is set");
                break;

            case FireFox:
                System.out.println("Firefox browser is set");
                break;

            case Safari:
                System.out.println("Safari browser is set");
                break;

            case Edge:
                System.out.println("Edge browser s set");
        }

        System.out.println("===============================");

        Day day1 = Day.Monday;
        Day day2 = Day.Tuesday;
        Day day3 = Day.Wednesday;

        Month month1 = Month.Apr;

        Level level1 = Level.low;
        Level level2 = Level.medium;
        Level level3 = Level.high;
        Level level4 = Level.ChuckNorries;






    }
}
