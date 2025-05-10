import java.util.*;

public class Harshad_no
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        
        int sum = 0;
        int temp = n;

        while(n != 0)
        {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("The sum of digits is: " + sum);
        if(temp % sum == 0)
        {
            System.out.println("The no. is a Harshad no.");
        }
        else
        {
            System.out.println("The no. is not a Harshad no.");
        }
    }
}
