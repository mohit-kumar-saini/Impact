import java.util.*;

public class Maximum_Subarray_Sliding_Window 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter window size:");
        int k = sc.nextInt();

        if (k > n || k <= 0) 
        {
            System.out.println("Invalid window size.");
            sc.close();
            return;
        }
        int currentSum = 0;
        int maxSum;
        int startIndex = 0;

        for (int i = 0; i < k; i++) 
        {
            currentSum += arr[i];
        }

        maxSum = currentSum;

        for (int i = k; i < n; i++) 
        {
            currentSum = currentSum - arr[i - k] + arr[i];
            if (currentSum > maxSum) 
            {
                maxSum = currentSum;
                startIndex = i - k + 1; 
            }     
        }

        System.out.print("Subarray with maximum sum: [");
        for (int j = startIndex; j < startIndex + k; j++) 
        {
            System.out.print(arr[j]);
            if (j < startIndex + k - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Maximum sum: " + maxSum);
        sc.close();
    }
}