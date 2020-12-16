package Office_Hours.Practice_09_23_2020.ShapeTask;

import com.sun.corba.se.spi.orbutil.threadpool.NoSuchThreadPoolException;
import com.sun.media.jfxmediaimpl.HostUtils;

public class ShapeObjects {

    public static void main(String[] args) {
        //Shape shape1 = new Shape();

        System.out.println("============SQUARE===========");

        Square square1 = new Square(10);
        System.out.println("Side: " + square1.side);
        System.out.println("Area: " + square1.calculateArea());
        System.out.println("Perimeter: " + square1.calculatePerimeter());
        System.out.println(square1);
        System.out.println("");

        System.out.println("=========CUBE===========");

        Cube cube1 = new Cube(10);
        System.out.println("Side: " + cube1.side);
        System.out.println("Area: " + cube1.calculateArea() );
        System.out.println("Perimeter: " + cube1.calculatePerimeter());
        System.out.println("Volume: " + cube1.calculateVolume());
        System.out.println(cube1);
        System.out.println("");

        System.out.println("============CIRCLE===========");
        Circle circle1 = new Circle(5);
        System.out.println("Radius: " + circle1.radius);
        System.out.println("Area: "  +circle1.calculateArea());
        System.out.println("Perimeter: " + circle1.perimeter);
        System.out.println(circle1);



    }
}
