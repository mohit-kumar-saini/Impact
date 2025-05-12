import java.util.*;

public class good_integer {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            int x = 1;
            int y = (int) Math.cbrt(a[i]);

            while (x <= y)
            {
                int z =  (int) (Math.pow(x, 3) + Math.pow(y, 3));
                if (z == a[i])
                {
                    count++;
                    break;
                } else if (z > a[i])
                {
                    y--;
                } else
                {
                    x++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
