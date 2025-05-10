import java.util.*;

public class Two_same_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
      
        int[] a = new int[n];
        int[] b = new int[m];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum1 += a[i];
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            sum2 += b[i];
        }

        if (sum1 == sum2 && n == m) {
            System.out.println("YES Both are same");
        } else {
            System.out.println("NO Both are not same");
        }
        sc.close();
    }
}