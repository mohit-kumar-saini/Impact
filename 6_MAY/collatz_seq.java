import java.util.*;

public class collatz_seq
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int  n = sc.nextInt();
        sc.close();

        if (n <= 0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            while (n != 1)
            {
                System.out.print(n + " -> ");
                if (n % 2 == 0)
                {
                    n = n / 2;
                }
                else
                {
                    n = (3 * n) + 1;
                }
            }
        }
        System.out.println(); 
    }    
}