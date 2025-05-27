import java.util.*;

public class Fibonacci_Series_Recursion 
{
    public static int fibonacci(int n) 
    {
        if (n <= 1) 
        {
            return n;
        } 
        else 
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series:");
        int terms = sc.nextInt();   
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < terms; i++) 
        {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        sc.close();
    }
}
