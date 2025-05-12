import java.util.*;

public class Sum_Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int  sum = 0;
        int even_sum = 0;
        int odd_sum = 0;
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if(arr[i] % 2 == 0)
            {
                even_sum += arr[i];
            }
            else
            {
                odd_sum += arr[i];
            }
            if(arr[i] > max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
                
            }
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Sum of even elements: " + even_sum);
        System.out.println("Sum of odd elements: " + odd_sum);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        sc.close();
    }
}