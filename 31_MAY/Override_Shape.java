class Shape 
{
    public double getArea() 
    {
        return 0.0;
    }
    public double getPerimeter() 
    {
        return 0.0;
    }
}

class Circle extends Shape 
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    public double getArea() 
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() 
    {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape 
{
    private double length, width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    public double getArea() 
    {
        return length * width;
    }

    public double getPerimeter() 
    {
        return 2 * (length + width);
    }
}

class Triangle extends Shape 
{
    private double a, b, c;

    public Triangle(double a, double b, double c) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() 
    {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() 
    {
        return a + b + c;
    }
}

public class Override_Shape {
    public static void main(String[] args) 
    {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
    }
}
