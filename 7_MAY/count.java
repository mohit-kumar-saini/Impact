import java.util.*;

public class count
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1 : ");
        long m = sc.nextLong();
        System.out.print("Enter the number2 : ");
        long n = sc.nextLong();
        sc.close();
        int count = 0;
        while(m != 0)
        {
            long rem = m % 10;
            if(rem == n)
            {
                count++;
            }
            m = m / 10;
        }
        System.out.println(count);
    }    
}