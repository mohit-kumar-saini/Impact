import java.util.*;

public class Natural_number_Sum_recursion 
{
    public static int sum(int n) 
    {
        if (n <= 0) 
        {
            return 0;
        } 
        else 
        {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number to calculate the sum:");
        int num = sc.nextInt();
        
        int result = sum(num);
        System.out.println("Sum of natural numbers up to " + num + " is: " + result);
        
        sc.close();
    }
    
}

