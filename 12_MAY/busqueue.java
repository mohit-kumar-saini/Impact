import java.util.*;

public class busqueue 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] groups = new int[n];
        for (int i = 0; i < n; i++) 
        {
            groups[i] = sc.nextInt();
        }
        
        int buses = 0, currentCapacity = 0;
        for (int i = 0; i < n; i++) {
            if (currentCapacity + groups[i] > m) 
            {
                buses++;
                currentCapacity = groups[i];
            } else 
            {
                currentCapacity += groups[i];
            }
        }
        if (currentCapacity > 0) buses++;
        System.out.println(buses);
        sc.close();
    }
}