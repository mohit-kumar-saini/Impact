class calculator
{
    public int add(int a, int b) 
    {
        return a + b;
    }

    public double add(double a, double b) 
    {
        return a + b;
    }

    public String add(String a, String b) 
    {
        return a + b;
    }
}

public class Polymorphism_Calculator 
{
    public static void main(String[] args) 
    {
        calculator calc = new calculator(); 

        int intResult = calc.add(5, 10);
        System.out.println("Integer addition: " + intResult);

        double doubleResult = calc.add(5.5, 10.2);
        System.out.println("Double addition: " + doubleResult);

        String stringResult = calc.add("Hello, ", "World!");
        System.out.println("String concatenation: " + stringResult);
    }
}