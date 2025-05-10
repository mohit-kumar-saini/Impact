import java.util.*;

public class printdigit
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        while(n != 0)
        {
            int rem = n % 10;
            System.out.println(rem);
            n = n / 10;
        }
    }    
}
