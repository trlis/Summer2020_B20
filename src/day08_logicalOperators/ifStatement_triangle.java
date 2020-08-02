package day08_logicalOperators;

public class ifStatement_triangle {
    public static void main(String[] args) {

        double angle1 = 60;
        double angle2 = 90;
        double angle3 = 30;

        boolean validTriangle = angle1 + angle2 + angle3 == 180;
        boolean invalidTriangle = !validTriangle;

        if (validTriangle == true) {
            System.out.println("The triangle is valid");
        }
        if (invalidTriangle == true) {
            System.out.println("The triangle is not valid");
        }
    }
}
