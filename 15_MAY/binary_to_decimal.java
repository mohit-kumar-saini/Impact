import java.util.*;

public class binary_to_decimal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int n = sc.nextInt();
        sc.close(); 

        int decimal = 0;
        int base = 1;

        while(n > 0) 
        {
            int rem = n % 10;
            decimal += rem * base;
            n /= 10;
            base *= 2;
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}