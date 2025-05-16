import java.util.*;

public class add_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int n = sc.nextInt();
        System.out.println("Enter the size of the second array:");
        int m = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int result1 = 0, result2 = 0;
        for (int i = 0; i < n; i++) {
            result1 = (result1 * 10) + arr1[n - 1 - i];
        }

        for (int j = 0; j < m; j++) {
            result2 = (result2 * 10) + arr2[m - 1 - j];
        }

        int sum = result1 + result2;
        System.out.println(result1);
        System.out.println(result2);

        System.out.println("The sum of the two arrays is: " + sum);

        int temp = sum;
        int count = (temp == 0) ? 1 : 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] result = new int[count];
        if (sum == 0) {
            result[0] = 0;
        } else {
            for (int i = 0; i < count; i++) {
                result[i] = sum % 10;
                sum /= 10;
            }
        }

        System.out.println("The sum of the two arrays is: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
