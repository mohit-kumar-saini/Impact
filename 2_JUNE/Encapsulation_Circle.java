class Circle 
{
    private double radius;
    public double getRadius() 
    {
        return radius;
    }

    public void setRadius(double radius) 
    {
        if (radius > 0) 
        {
            this.radius = radius;
        } else 
        {
            System.out.println("Radius must be positive.");
        }
    }

    public double calculateArea() 
    {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() 
    {
        return 2 * Math.PI * radius;
    }
}

public class Encapsulation_Circle 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle();
        c.setRadius(7.0); 

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Perimeter: " + c.calculatePerimeter());
    }
}