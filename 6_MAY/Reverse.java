import java.util.*;

public class Reverse
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int  n = sc.nextInt();
        sc.close();
        int rev = 0;
        // while (n != 0)
        // {
        //     int digit = n % 10; 
        //     rev = rev * 10 + digit;
        //     n = n / 10; 
        // }
        int f = n / 100;
        int m = (n % 100)/10;
        int t = n % 10;
        rev = t * 100 + m * 10 + f;
        System.out.println("Reversed number is: " + rev);
    }
}