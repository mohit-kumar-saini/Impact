class Shape 
{
    public double getArea() 
    {
        return 0.0;
    }
}
class Rectangle extends Shape 
{
    private double length;
    private double width;
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
    public double getArea() 
    {
        return length * width;
    }
}
public class Override_Rectangle_area 
{
    public static void main(String[] args) 
    {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rect.getArea());
    }
}
