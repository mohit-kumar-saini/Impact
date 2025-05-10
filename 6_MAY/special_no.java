import java.util.*;

public class special_no 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        sc.close();

        for(int i = n1; i <= n2; i++)
        {
            int f = i / 10;
            int l = i % 10;
            
            int sum = f + l;
            int prod = f * l;
            int result = sum + prod;
            
            if(result == i)
            {
                System.out.println(i);
            }
        }
    }
}
