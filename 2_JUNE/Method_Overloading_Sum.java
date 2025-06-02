public class Method_Overloading_Sum 
{
    public int sum(int a, int b) 
    {
        return a + b;
    }
    public double sum(double a, double b) 
    {
        return a + b;
    }
    public int sum(int a, int b, int c) 
    {
        return a + b + c;
    }
    public static void main(String[] args) {
        Method_Overloading_Sum obj = new Method_Overloading_Sum();
        System.out.println("Sum of 5 and 10 (int): " + obj.sum(5, 10));
        System.out.println("Sum of 4.5 and 3.2 (double): " + obj.sum(4.5, 3.2));
        System.out.println("Sum of 1, 2 and 3 (int): " + obj.sum(1, 2, 3));
    }
} 