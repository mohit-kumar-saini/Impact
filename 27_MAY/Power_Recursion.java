import java.util.*;

public class Power_Recursion 
{
    public static int power(int base, int power) 
    {
        if (power == 0) 
        {
            return 1; 
        } 
        else 
        {
            return base * power(base, power - 1); 
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = sc.nextInt();
        System.out.println("Enter the powert:");
        int power = sc.nextInt();
        int result = power(base, power);
        System.out.println(base + " raised to the power of " + power + " is: " + result);
        sc.close();
    }    
}
