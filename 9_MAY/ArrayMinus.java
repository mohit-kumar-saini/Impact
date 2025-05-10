import java.util.*;

public class ArrayMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int diff = a[0];
        for (int i = 1; i < n; i++) {
            diff -= a[i];
        }

        System.out.println("Difference of all elements is: " + diff);
        sc.close();
    }
}
