//Task-3
public abstract class Shapes {
    public abstract double calculateArea();
}

class Circle extends Shapes{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double circleArea = circle.calculateArea();
        System.out.println("Cirle Area: " + circleArea);
    }
}

class Rectangle extends Shapes{
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea(){
    return width * length;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}

class Triangle extends Shapes{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(7.0, 4);
        double triangleArea = triangle.calculateArea();
        System.out.println("Triangle area :" +triangleArea);
    }
}
