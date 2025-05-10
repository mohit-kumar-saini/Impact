import java.util.*;

public class compatible_array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            
        }

        for (int i = 0; i < n; i++)
        {
            if (a[i] >= b[i]) {
                count++;
            }
        }

        if(count == n ) 
        {
            System.out.println("YES Both are compatible");
        } else
        {
            System.out.println("NO Both are not compatible");
        }
        sc.close();
    }
}
