package Office_Hours.Practice_09_23_2020.ShapeTask;

public class Circle extends Shape{

    public double radius;

    public Circle(double radius){
        if(radius<=0){
            throw new RuntimeException("Circle' radius can not be negative or zero");

        }
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();

    }


    @Override
    public double calculateArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius*2*Math.PI;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius: " + radius +
                ", area: " + area +
                ", perimeter: " + perimeter +
                ", volume: " + volume +
                '}';
    }
}
