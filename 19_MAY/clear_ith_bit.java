import java.util.*;

public class clear_ith_bit 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the position of the bit to be cleared: ");
        int i = sc.nextInt();

        if ((n & (1 << i)) != 0) 
        {
            int result = n & ~(1 << i);
            System.out.printf("Result after clearing the %d-th bit: %d\n", i, result);
        } 
        else 
        {
            System.out.printf("The %d-th bit is already cleared.\n", i);
        }
        sc.close();
    }
    
}
