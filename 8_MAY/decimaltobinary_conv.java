import java.util.*;
public class decimaltobinary_conv 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int n = sc.nextInt();
        sc.close(); 

        int binary = 0;
        int base = 1;

        while(n > 0) 
        {
            int rem = n % 2;
            binary += rem * base;
            n /= 2;
            base *= 10;
        }

        System.out.println("Binary equivalent: " + binary);
    }
    
}
