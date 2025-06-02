class Rectangle 
{
    private int length;
    private int breadth;

    public int getLength() 
    {
        return length;
    }

    public void setLength(int length) 
    {
        this.length = length;
    }

    public int getBreadth() 
    {
        return breadth;
    }

    public void setBreadth(int breadth) 
    {
        this.breadth = breadth;
    }
}

public class EncapsulationLength 
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setBreadth(5);

        System.out.println("Length: " + r.getLength());
        System.out.println("Breadth: " + r.getBreadth());
    }
}
