package Office_Hours.Practice_09_23_2020.ShapeTask;
/*
     Shapes task:

     interface Volume:
        hasVolume = true;
        calculateVolume();

     abstract class Shape:
        calculateArea();
        calculatePerimeter();

    Square: extends Shape
        calculateArea(){}
        calculatePerimeter(){}

    Rectangle: extends Shape
        calculateArea(){}
        calculatePerimeter(){}

    Cylinder: extends Shape implements Volume
        calculateArea(){}
        calculatePerimeter(){}
        calculateVolume(){}

 */
 public abstract class Shape {

    public double area;
    public double perimeter;
    public double volume;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();


    /*I do not have all the info to calculate Area or Perimeter of the Shape,
      therefore we should not create this Constructor
    public Shape(){
        area = calculateArea();
        perimeter = calculatePerimeter();

    }
    */
}
