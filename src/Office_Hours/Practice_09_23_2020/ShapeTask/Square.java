package Office_Hours.Practice_09_23_2020.ShapeTask;

public class Square extends Shape{
    //The regular sub class has to override all abstract methods fro parent
    public double side;

    public Square(double side){
        if(side<=0){
            throw new RuntimeException("Side of the square cannot be negative or zero");
        }
        this.side =side;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea(){
        return Math.pow(side,2);
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square parameters {" +
                "side: " + side +
                ", area: " + area +
                ", perimeter: " + perimeter +
                ", volume: " + volume +
                '}';
    }
}
